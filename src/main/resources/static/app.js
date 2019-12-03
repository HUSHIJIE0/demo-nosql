var stompClient = null;

function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
    }
    else {
        $("#conversation").hide();
    }
    $("#greetings").html("");
}

function setSubscribe(subscribe) {
    $("#subscribe").prop("disabled", subscribe);
    $("#disSubscribe").prop("disabled", !subscribe);
}

// 订阅消息对象，用于关闭订阅
var _subscribeQueue, _subscribeTopic;

function connect() {
    var socket = new SockJS('/gs-guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        _subscribeQueue = stompClient.subscribe('/topic/greetings', function (greeting) {
            showGreeting(JSON.parse(greeting.body).content);
        });
    });
}

function subscribe() {
    setSubscribe(true);
    _subscribeTopic = stompClient.subscribe('/topic/sub', function (greeting) {
        showGreeting(JSON.parse(greeting.body).content);
    });
}

function disconnect() {
    if (stompClient !== null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}

function sendName() {
    stompClient.send("/app/hello", {}, JSON.stringify({'name': $("#name").val()}));
}

function sendNameSub() {
    stompClient.send("/app/send", {}, JSON.stringify({'name': $("#nameSub").val()}));
}

function showGreeting(message) {
    $("#greetings").append("<tr><td>" + message + "</td></tr>");
}

function disSubscribe(){
    if (_subscribeQueue) {
        _subscribeQueue.unsubscribe();
    }
    if (_subscribeTopic) {
        _subscribeTopic.unsubscribe();
    }
    setSubscribe(false);
}


$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $( "#connect" ).click(function() { connect(); });
    $( "#disconnect" ).click(function() { disconnect(); });
    $( "#send" ).click(function() { sendName(); });
    $( "#sendSub" ).click(function() { sendNameSub(); });
    $( "#subscribe" ).click(function() { subscribe(); });
    $( "#disSubscribe" ).click(function() { disSubscribe(); });
});

