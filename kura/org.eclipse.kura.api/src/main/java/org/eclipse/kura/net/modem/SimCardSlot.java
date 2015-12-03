package org.eclipse.kura.net.modem;

public enum SimCardSlot {
	A(0),
	B(1);
	
	private int m_slot;
	private SimCardSlot(int slot) {
		m_slot = slot;
	}
	
	public int getValue() {
		return m_slot;
	}
	
	public static SimCardSlot getSimCardSlot(int slot) {
		SimCardSlot ret = null;
		switch (slot) {
		case 0:
			ret = B;
			break;
		case 1:
			ret = A;
			break;
		}
		return ret;
	}
}
