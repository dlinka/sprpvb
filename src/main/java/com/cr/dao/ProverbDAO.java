package com.cr.dao;

import com.cr.entity.Proverb;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProverbDAO {

    Proverb findProverbById(Integer userId);

    List<Proverb> findProverbByColumn(@Param("column") String column, @Param("value") String value);

    List<Proverb> findAllProverbs();

    Integer addProverb(Proverb prover);

    Integer updateProverb(@Param("column") String column, @Param("value") String value, @Param("proverbId") Integer proverbId);

    Boolean updateProverbStar(Integer proverbId);
}
