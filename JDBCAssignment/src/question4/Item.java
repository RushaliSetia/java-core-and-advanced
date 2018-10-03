package question4;

public class Item {

	private int id;
	private String name;
	private int time;

	public Item(int id, String name, int time) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
	}

	public Item() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", time=" + time + "]";
	}

}
