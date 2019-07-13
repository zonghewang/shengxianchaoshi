package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.BuyInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.OutgoingRecordInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Refunds;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.RefundsInfo;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.SalesOrderInfo;

public class ListForm {
	 	private List<BuyInfo> buyInfos;
	 	
	 	private List<RefundsInfo> refundsInfos;
	 	
	 	private List<SalesOrderInfo> salesOrderInfos;
	 	
	 	private List<OutgoingRecordInfo> outgoingRecordInfos;

		public List<BuyInfo> getBuyInfos() {
			return buyInfos;
		}

		public void setBuyInfos(List<BuyInfo> buyInfos) {
			this.buyInfos = buyInfos;
		}

		public List<RefundsInfo> getRefundsInfos() {
			return refundsInfos;
		}

		public void setRefundsInfos(List<RefundsInfo> refundsInfos) {
			this.refundsInfos = refundsInfos;
		}

		public List<SalesOrderInfo> getSalesOrderInfos() {
			return salesOrderInfos;
		}

		public void setSalesOrderInfos(List<SalesOrderInfo> salesOrderInfos) {
			this.salesOrderInfos = salesOrderInfos;
		}

		public List<OutgoingRecordInfo> getOutgoingRecordInfos() {
			return outgoingRecordInfos;
		}

		public void setOutgoingRecordInfos(List<OutgoingRecordInfo> outgoingRecordInfos) {
			this.outgoingRecordInfos = outgoingRecordInfos;
		}


		


	
	
	

	
	
}
