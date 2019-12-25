package com.cr.service;

import com.cr.entity.Proverb;
import com.github.pagehelper.PageInfo;

public interface ProverbService {

    Proverb getProverb(Integer proverbId);

    PageInfo<Proverb> getProverbList(Integer pageNum, Integer pageSize);

    Boolean updateProverbStar(Integer proverbId);

}
