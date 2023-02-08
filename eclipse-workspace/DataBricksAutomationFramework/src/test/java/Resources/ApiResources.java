package Resources;

public enum ApiResources {

	CreateTokenApi("/api/2.0/token/create"),
	GetListofToken("/api/2.0/token/list"),
	DeleteToken("/api/2.0/token/delete"),
	CreateWarehouseAPI("/api/2.0/sql/warehouses"),
	GetWarehouseAPI("/api/2.0/sql/warehouses/");
	
	String Resource;

	ApiResources(String Resource){
		this.Resource = Resource;
		
	}
	
	public String getResource() {
		return Resource;
	}
}
