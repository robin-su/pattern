package com.suyb.selfStudy.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义聚合类
 */
public class ConcreteMyAggregate {
	
	private List<Object> list = new ArrayList<Object>();
	
	public ConcreteMyAggregate() {
		super();
	}

	public void addObject(Object obj) {
		this.list.add(obj);
	}
	
	public void removeObject(Object obj) {
		this.list.remove(obj);
	}
	
	//获得迭代器的方法
	public MyIterator createIterator() {
		return new ConcreteIterator();
	}
	
	/**
	 *	 使用内部类定义迭代器，可以直接使用外部类的属性
	 */
	private class ConcreteIterator implements MyIterator {
		
		private int cursor; //定义游标，用于记录遍历时的位置（若想逆向，这里cursor = list.size -1,后面的next++改成--）

		@Override
		public void first() {
			cursor = 0;
		}

		@Override
		public Object getCurrentObj() {
			return list.get(cursor);
		}
		
		@Override
		public boolean hasNext() {
			if(cursor < list.size()) {
				return true;
			}
			return false;
		}

		@Override
		public boolean isFirst() {
			return cursor == 0 ? true : false;
		}

		@Override
		public boolean isLast() {
			return cursor == (list.size()-1) ? true : false;
		}
		
		@Override
		public void next() {
			if(cursor < list.size() ) {
				cursor ++;
			}
		}
		
	}
}
