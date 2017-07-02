package clent;
import com.rem.parser.generation.*;
import clgen.*;
public abstract class ExternalBodyEntry extends ExternalImportEntry {
	protected int tabs = 0;
	public void setTabs(int newTabs){
		tabs = newTabs;
	}
	public ExternalBodyEntry with(Entry... classNames){
		if(classNames != null){
			for(Entry className:classNames){
				this.addImport(new ImportEntry(className));
			}
		}
		return this;
	}
}