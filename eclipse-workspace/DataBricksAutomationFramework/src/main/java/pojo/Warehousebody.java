package pojo;

public class Warehousebody {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCluster_size() {
		return cluster_size;
	}
	public void setCluster_size(String cluster_size) {
		this.cluster_size = cluster_size;
	}
	public int getMin_num_clusters() {
		return min_num_clusters;
	}
	public void setMin_num_clusters(int min_num_clusters) {
		this.min_num_clusters = min_num_clusters;
	}
	public int getMax_num_clusters() {
		return max_num_clusters;
	}
	public void setMax_num_clusters(int max_num_clusters) {
		this.max_num_clusters = max_num_clusters;
	}
	private String cluster_size;
	private int min_num_clusters;
	private int max_num_clusters;
	

}
