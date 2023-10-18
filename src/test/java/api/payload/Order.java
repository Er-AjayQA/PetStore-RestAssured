package api.payload;

public class Order {

	int id;
	int petId;
	int quantity;
	String shipDate;
	String status;
	boolean complete;
	

	public int getId() {
		System.out.println(id);
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPetId() {
		System.out.println(petId);
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public int getQuantity() {
		System.out.println(quantity);
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getShipDate() {
		System.out.println(shipDate);
		return shipDate;
	}

	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}

	public String getStatus() {
		System.out.println(status);
		return status;
	}

	public void setStatus(String randStatus) {
		this.status = randStatus;
	}

	public boolean isComplete() {
		System.out.println(complete);
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	

	

}
