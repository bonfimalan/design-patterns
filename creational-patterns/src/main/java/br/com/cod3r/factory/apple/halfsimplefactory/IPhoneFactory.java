package br.com.cod3r.factory.apple.halfsimplefactory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhoneLevel;

public abstract class IPhoneFactory {
  public IPhone orderIPhone(IPhoneLevel level) {
    IPhone iPhone = createIPhone(level);

    iPhone.getHardware();
    iPhone.assemble();
    iPhone.certificates();
    iPhone.pack();

    return iPhone;
  }

  abstract public IPhone createIPhone(IPhoneLevel level);
	
}
