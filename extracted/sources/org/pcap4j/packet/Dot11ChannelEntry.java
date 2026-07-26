package org.pcap4j.packet;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11ChannelEntry implements Serializable {
    private static final long serialVersionUID = -1866907693281185049L;
    private final byte channel;
    private final byte operatingClass;

    public Dot11ChannelEntry(byte b, byte b2) {
        this.operatingClass = b;
        this.channel = b2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Dot11ChannelEntry.class != obj.getClass()) {
            return false;
        }
        Dot11ChannelEntry dot11ChannelEntry = (Dot11ChannelEntry) obj;
        return this.channel == dot11ChannelEntry.channel && this.operatingClass == dot11ChannelEntry.operatingClass;
    }

    public byte getChannel() {
        return this.channel;
    }

    public int getChannelAsInt() {
        return this.channel & 255;
    }

    public byte getOperatingClass() {
        return this.operatingClass;
    }

    public int getOperatingClassAsInt() {
        return this.operatingClass & 255;
    }

    public int hashCode() {
        return ((this.channel + 31) * 31) + this.operatingClass;
    }

    public String toString() {
        return "[Operating Class: " + getOperatingClassAsInt() + ", Channel: " + getChannelAsInt() + "]";
    }
}
