package com.example.demo.elasticsearch;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 * @Author: Michael
 * @Date: Created in 10:29 2018/11/21
 * @Desciption:
 */
@Component
public interface GoodsRepository extends ElasticsearchRepository<GoodsInfo,Long> {
}
