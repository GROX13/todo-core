package ge.edu.freeuni.sdp.todo.core;

public class TaskEntityId {
	
	private String partitionKey;
	private String rowKey;

	public TaskEntityId(String partitionKey, String rowKey) {
		this.partitionKey = partitionKey;
		this.rowKey  = rowKey;
	}
	
	public TaskEntityId(String id) {
		final int cutIndex = 3;
		this.partitionKey = id.substring(0, 3);
		this.rowKey = id.substring(cutIndex+1, id.length()-1);
	}
	
	public String getId() {
		return this.partitionKey.concat(this.rowKey);
	}

	public String getPartitionKey() {
		return partitionKey;
	}

	public String getRowKey() {
		return rowKey;
	}
}
