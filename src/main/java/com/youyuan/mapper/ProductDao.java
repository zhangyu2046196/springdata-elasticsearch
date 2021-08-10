package com.youyuan.mapper;

import com.youyuan.domain.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * 类名称：ProductDao <br>
 * 类描述： 产品实体数据接口 <br>
 *
 * @author zhangyu
 * @version 1.0.0
 * @date 创建时间：2021/8/10 10:38<br>
 */
@Repository
public interface ProductDao extends ElasticsearchRepository<Product,Long> {

}
