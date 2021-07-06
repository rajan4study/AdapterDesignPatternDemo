/**
 * 
 */
package com.study.design.structure.adapter;

/**
 * @author 
 *
 */
public class Assignment {

	private Pen pen= new PenAdapter();

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}
	
	public void write() {
		pen.write();
	}
	
}
