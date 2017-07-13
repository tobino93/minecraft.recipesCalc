package java.server.model;

/**
 * Identify an Item without recipe
 * @author daniele.cracco
 *
 */
public class Item {
	private Long id;
	private String name;
	private String mod;
	private String minecraft_version;
	
	public Item(){
		
	}
	
	public Item(Item item){
		
	}

	public Item(Long id, String name, String mod, String minecraft_version) {
		this.id = id;
		this.name = name;
		this.mod = mod;
		this.minecraft_version = minecraft_version;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public String getMinecraft_version() {
		return minecraft_version;
	}

	public void setMinecraft_version(String minecraft_version) {
		this.minecraft_version = minecraft_version;
	}
	
	
}
