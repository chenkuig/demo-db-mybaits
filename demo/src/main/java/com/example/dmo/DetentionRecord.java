/*
 * Copyright © 2015-2026 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.dmo;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

/**
 * <pre>
 * 名称: DetentionRecord
 * 描述: 滞留问题清单记录
 * </pre>
 *
 * @author chenkui
 * @since 1.0.0
 */
@Data
@Table(name="t_detention_record")
public class DetentionRecord extends BaseEntity{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    private Long id;
    //运单编号
    private String expressNumber;
    //上报人编号
    private String reportUserCode;
    //上报人姓名
    private String reportUserName;
    //上报网点编号
    private String reportOrgCode;
    //上报网点名称
    private String reportOrgName;
    //上报城市编号
    private String reportCityCode;
    //上报城市名称
    private String reportCityName;
    //上报省区编码
    private String reportProvinceCode;
    //上报省区名称
    private String reportProvinceName;
    //上报县区编码
    private String reportCountyCode;
    //上报县区名称
    private String reportCountyName;
    //创建时间
    private Date reportTime;
    //滞留原因编号
    private String detentionReasonCode;
    //滞留原因
    private String detentionReason;
    //滞留原因备注
    private String detentionReasonRemarks;
    //面单重量
    private Double expressFaceWeight;
    //复称重量
    private Double expressAgainWeight;
    //面单运费
    private Double expressFaceFreight;
    //长
    private Double expressLength;
    //宽
    private Double expressWidth;
    //高
    private Double expressHeight;
    //体积重量
    private Double expressVolumeWeight;
    //响应类型 ，1:知晓类，2：回复类
    private Integer responseType;
    //滞留状态，0:已完结，1：处理中，2:未处理
    private Integer detentionStatus;
    //收件员编号
    private String receiveUserCode;
    //收件员姓名
    private String receiveUserName;
    //派件员编号
    private String dispatchUserCode;
    //派件员姓名
    private String dispatchUserName;
    //运单类型，快递时效
    private String courierType;
    //运单状态
    private Integer courierStatus;
    //寄件人名称
    private String sendUserName;
    //寄件人电话
    private String sendUserPhone;
    //收件人名称
    private String addresseeName;
    //收件人电话
    private String addresseePhone;
    //接收网点编号
    private String receiveOrgCode;
    //接收网点名称
    private String receiveOrgName;
    //客服处理人编号
    private String dealUserCode;
    //客服处理人姓名
    private String dealUserName;
    //客服处理时间
    private Date dealTime;
    //最后处理人编号
    private String lastDealUserCode;
    //最后处理人姓名
    private String lastDealUserName;
    //最后处理时间
    private Date lastDealTime;
    //数据来源
    private String dataSource;
    //快递时效
    private String expressTime;
    //滞留件状态第一次完结时间
    private Date firstDealFinishedTime;

    private String filePath1;

    private String filePath2;

    private String filePath3;

    private String filePath4;

    private String filePath5;

    private String filePath6;

    private String filePath7;

    private String filePath8;

    private String filePath9;

    private String filePath10;
    @Transient
    private String filePath11;
}
