package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dmo.DetentionRecord;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageRowBounds;

import mymapper.MyMapper;


@Mapper
public interface DetentionRecordDao extends MyMapper<DetentionRecord>{
   Long countTotalNum();
   List<DetentionRecord>  searchPage();
   Page<DetentionRecord>  searchPage(PageRowBounds pageRowBounds);
}
