package DesignPattern.Adapter_DesignPattern;
import DesignPattern.Adapter_DesignPattern.com_Krishna_PilotPen.PilotPen;

public class PenAdapter {
    PilotPen pp = new PilotPen();

    @Override
    public void write(String str){
        pp.mark(str);
    }
}
