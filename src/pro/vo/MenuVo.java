package pro.vo;

public class MenuVo {
	int no;
	String name;
	int price;
	int store;
	String fileUrl;
	String fileName;
	
	// 강성택 메뉴 카운트 추가
	int cnt;
	
	
	
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getStore() {
		return store;
	}
	public void setStore(int store) {
		this.store = store;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "MenuVo [no=" + no + ", name=" + name + ", price=" + price + ", store=" + store + ", fileUrl=" + fileUrl
				+ ", fileName=" + fileName + "]";
	}
}