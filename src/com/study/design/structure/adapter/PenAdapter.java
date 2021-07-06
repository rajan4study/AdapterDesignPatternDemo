package com.study.design.structure.adapter;

import com.study.design.structure.adapter.model.PenPark;

/**
 * @author 
 *
 */
public class PenAdapter implements Pen {
	
	private PenPark penPark= new PenPark();

	@Override
	public void write() {
		penPark.write();

	}

}
