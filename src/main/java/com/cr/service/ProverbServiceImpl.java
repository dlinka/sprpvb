package com.cr.service;

import com.cr.dao.ProverbDAO;
import com.cr.entity.Proverb;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProverbServiceImpl implements ProverbService {

    @Autowired
    private ProverbDAO proverbDAO;

    @Override
    public Proverb getProverb(Integer proverbId) {
        return proverbDAO.findProverbById(proverbId);
    }

    @Override
    public PageInfo<Proverb> getProverbList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Proverb> list = proverbDAO.findAllProverbs();
        return new PageInfo<>(list);
    }

    @Override
    public Boolean updateProverbStar(Integer proverbId) {
        return proverbDAO.updateProverbStar(proverbId);
    }

}
