class Order {
	Item[] arr;
	
	Order(){
		this.arr = new Item[100];
	};
	
	int count = 0;
	
	public void addItem(Item x) {
		count++;
		this.arr[count - 1] = x;
	}
	
	double calculateAverageCost() {
		double ave_cost = 0.0;
		for (int i = 0; i < count; ++i)
			ave_cost += this.arr[i].price;
		ave_cost /= count;
		return ave_cost;
	}
}
