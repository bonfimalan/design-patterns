package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;

public abstract class IPhoneFactory {
  public IPhone orderIPhone() {
    IPhone iPhone = createIPhone();

    iPhone.getHardware();
    iPhone.assemble();
    iPhone.certificates();
    iPhone.pack();

    return iPhone;
  }

  abstract public IPhone createIPhone();
	
}
