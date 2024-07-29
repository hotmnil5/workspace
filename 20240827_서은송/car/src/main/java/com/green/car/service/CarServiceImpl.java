package com.green.car.service;

import com.green.car.vo.CarVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("carService")
public class CarServiceImpl implements CarService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public List<CarVO> getCarList() {
        return sqlSession.selectList("carMapper.getCarList");
    }
}
