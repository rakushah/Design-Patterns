package decorator;

import component.ListProfiler;

public abstract class ListDecorator implements ListProfiler {
	protected ListProfiler decoratedList;

	public ListDecorator(ListProfiler decoratedList) {
		this.decoratedList = decoratedList;
	}

	@Override
	public boolean add(Object e) {

		return decoratedList.add(e);

	}

	@Override
	public boolean contains(Object e) {

		return decoratedList.contains(e);

	}

	@Override
	public boolean remove(Object e) {

		return decoratedList.remove(e);

	}

	@Override
	public int size() {

		return decoratedList.size();

	}

}
