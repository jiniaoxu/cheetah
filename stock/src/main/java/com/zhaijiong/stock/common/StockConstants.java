package com.zhaijiong.stock.common;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * author: xuqi.xq
 * mail: xuqi.xq@alibaba-inc.com
 * date: 15-8-30.
 */
public class StockConstants {
    public static List<String> REALTIME = Lists.newArrayList(
            "marketType",           //0     市场类型,沪市:1,深市:2
            "code",                 //1     证券代码
            "name",                 //2     证券名称
            "buy1",                 //3     买一
            "buy2",                 //4     买二
            "buy3",                 //5     买三
            "buy4",                 //6     买四
            "buy5",                 //7     买五
            "sell1",                //8     卖一
            "sell2",                //9     卖二
            "sell3",                //10     卖三
            "sell4",                //11    卖四
            "sell5",                //12    卖五
            "buy1Volume",           //13    买一手数
            "buy2Volume",           //14    买二手数
            "buy3Volume",           //15    买三手数
            "buy4Volume",           //16    买四手数
            "buy5Volume",           //17    买五手数
            "sell1Volume",          //18    卖一手数
            "sell2Volume",          //19    卖二手数
            "sell3Volume",          //20    卖三手数
            "sell4Volume",          //21    卖四手数
            "sell5Volume",          //22    卖五手数
            "limitUp",              //23    涨停价
            "limitDown",            //24    跌停价
            "close",                //25    最新价,收盘价
            "avgCost",              //26    均价
            "changeAmount",         //27    涨跌额
            "open",                 //28    开盘价
            "change",               //29    涨跌幅
            "high",                 //30    最高价
            "volume",               //31    成交量，单位：手
            "low",                  //32    最低价
            "",                     //33    未知
            "lastClose",            //34    昨收盘
            "amount",               //35    成交额,单位:元
            "quantityRelative ",    //36    量比
            "turnoverRate",         //37    换手率
            "PE",                   //38    市盈率
            "outerDisc",            //39    外盘,主动买
            "innerDisc",            //40    内盘,主动卖
            "committeeThan",        //41    委比,百分比
            "committeeSent",        //42    委差
            "PB",                   //43    市净率
            "",                     //44    未知
            "circulationMarketValue",   //45流通市值,单位:元
            "aggregateMarketValue",     //46总市值,单位:元
            "",                     //47    未知
            "",                     //48    未知
            "date"                  //49    时间
    );

    public static List<String> MONEYFLOW = Lists.newArrayList(
            "今日主力净流入",      //0    今日主力净流入
            "主力净比",         //1 主力净比
            "今日超大单净流入",     //2 今日超大单净流入
            "超大单净比",        //3 超大单净比
            "今日大单净流入",      //4 今日大单净流入
            "大单净比",         //5 大单净比
            "今日中单净流入",      //6 今日中单净流入
            "中单净比",         //7 中单净比
            "今日小单净流入",      //8 今日小单净流入
            "小单净比",         //9 小单净比
            "未知1",           //10    未知
            "未知2",           //11    未知
            "超大单:流入",       //12    超大单:流入
            "超大单:流出",       //13    超大单:流出
            "大单:流入",       //14    大单:流入
            "大单:流出",       //15    大单:流出
            "中单:流入",       //16    中单:流入
            "中单:流出",       //17    中单:流出
            "小单:流入",       //17    小单:流入
            "小单:流出",       //18    小单:流出
            "未知3",           //19    未知
            "未知4"           //20    未知

    );

    public static List<String> MONEYFLOW_HIS = Lists.newArrayList(
            "date",         //0     日期
            "close",        //1     收盘价
            "change",       //2     涨跌幅
            "主力净流入-净额",     //3     主力净流入-净额
            "主力净流入-净占比",    //4     主力净流入-净占比
            "超大单净流入-净额",    //5     超大单净流入-净额
            "超大单净流入-净占比",   //6     超大单净流入-净占比
            "大单净流入-净额",     //7     大单净流入-净额
            "大单净流入-净占比",    //8     大单净流入-净占比
            "中单净流入-净额",     //9     中单净流入-净额
            "中单净流入-净占比",    //10    中单净流入-净占比
            "小单净流入-净额",     //11    小单净流入-净额
            "小单净流入-净占比"    //12     小单净流入-净占比
    );

}