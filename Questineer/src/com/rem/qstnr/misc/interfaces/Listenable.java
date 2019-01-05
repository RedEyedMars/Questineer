package com.rem.qstnr.misc.interfaces;
import com.rem.qstnr.misc.interfaces.Listenable;
public interface Listenable <TypeName> {
	public Boolean listen(TypeName event);
}
