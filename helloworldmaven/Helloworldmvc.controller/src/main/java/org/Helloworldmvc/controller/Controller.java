package org.Helloworldmvc.controller;

import org.Helloworldmvc.contract.iModel;
import org.Helloworldmvc.contract.iView;

public class Controller {
	private final iView view;
	private final iModel model;
	
	public Controller(final iView view, final iModel model) {
		this.view = view;
		this.model = model;
	}
	public void run() {
		this.view.displayMessage(this.model.getHelloWorld());
	}

}
