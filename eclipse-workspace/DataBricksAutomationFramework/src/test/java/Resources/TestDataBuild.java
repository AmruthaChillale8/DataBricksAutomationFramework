package Resources;

import pojo.Warehousebody;
import pojo.tokenbody;

public class TestDataBuild {
	
	public tokenbody addTokenPayload() {
		tokenbody tb = new tokenbody();
		tb.setComment("comment");
		tb.setLifetime_seconds(777600);
		return tb;
	}
	
	public Warehousebody addWarehousePayload() {
		Warehousebody h = new Warehousebody();
		h.setName("Sql warehouse");
		h.setCluster_size("Medium");
		h.setMax_num_clusters(10);
		h.setMin_num_clusters(1);
		return h;
	}
	
	
}
