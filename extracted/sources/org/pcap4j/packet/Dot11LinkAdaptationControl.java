package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.Serializable;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11LinkAdaptationControl implements Serializable {
    public static final byte ASELI = 14;
    private static final long serialVersionUID = 7735461000002622072L;
    private final Aselc aselc;
    private final boolean aseli;
    private final Mai mai;
    private final Byte mfb;
    private final byte mfsi;
    private final boolean trq;
    private final boolean vhtMfb;

    public enum AselCommand {
        TXASSI(0, "TXASSI"),
        TXASSR(1, "TXASSR"),
        RXASSI(2, "RXASSI"),
        RXASSR(3, "RXASSR"),
        SOUNDING_LABEL(4, "Sounding Label"),
        NO_FEEDBACK(5, "No Feedback"),
        TXASSI_CSI(6, "TXASSI-CSI"),
        SEVEN(7, "Reserved");

        private final String name;
        private final int value;

        AselCommand(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static AselCommand getInstance(int i) {
            for (AselCommand aselCommand : values()) {
                if (aselCommand.value == i) {
                    return aselCommand;
                }
            }
            throw new IllegalArgumentException(rm7.n(i, "Invalid value: "));
        }

        public String getName() {
            return this.name;
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb = new StringBuilder(50);
            sb.append(this.value);
            sb.append(" (");
            return dw1.s(sb, this.name, ")");
        }
    }

    public static final class Builder {
        private byte maiOrAseli;
        private byte mfbOrAselc;
        private byte mfsi;
        private boolean trq;
        private boolean vhtMfb;

        public Dot11LinkAdaptationControl build() {
            return new Dot11LinkAdaptationControl(this);
        }

        public Builder maiOrAseli(byte b) {
            this.maiOrAseli = b;
            return this;
        }

        public Builder mfbOrAselc(byte b) {
            this.mfbOrAselc = b;
            return this;
        }

        public Builder mfsi(byte b) {
            this.mfsi = b;
            return this;
        }

        public Builder trq(boolean z) {
            this.trq = z;
            return this;
        }

        public Builder vhtMfb(boolean z) {
            this.vhtMfb = z;
            return this;
        }

        public Builder() {
        }

        public Builder maiOrAseli(Mai mai) {
            this.maiOrAseli = mai.getRawData();
            return this;
        }

        public Builder mfbOrAselc(Aselc aselc) {
            this.mfbOrAselc = aselc.getRawData();
            return this;
        }

        private Builder(Dot11LinkAdaptationControl dot11LinkAdaptationControl) {
            this.vhtMfb = dot11LinkAdaptationControl.vhtMfb;
            this.trq = dot11LinkAdaptationControl.trq;
            this.maiOrAseli = dot11LinkAdaptationControl.mai.getRawData();
            this.mfsi = dot11LinkAdaptationControl.mfsi;
            this.mfbOrAselc = dot11LinkAdaptationControl.mfb.byteValue();
        }
    }

    public static Dot11LinkAdaptationControl newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Dot11LinkAdaptationControl(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Dot11LinkAdaptationControl.class != obj.getClass()) {
            return false;
        }
        Dot11LinkAdaptationControl dot11LinkAdaptationControl = (Dot11LinkAdaptationControl) obj;
        Mai mai = this.mai;
        if (mai == null) {
            if (dot11LinkAdaptationControl.mai != null) {
                return false;
            }
        } else if (!mai.equals(dot11LinkAdaptationControl.mai)) {
            return false;
        }
        return this.mfb.equals(dot11LinkAdaptationControl.mfb) && this.mfsi == dot11LinkAdaptationControl.mfsi && this.aseli == dot11LinkAdaptationControl.aseli && this.vhtMfb == dot11LinkAdaptationControl.vhtMfb && this.trq == dot11LinkAdaptationControl.trq;
    }

    public Aselc getAselc() {
        if (this.aseli) {
            return this.aselc;
        }
        return null;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public Mai getMai() {
        return this.mai;
    }

    public Byte getMfb() {
        if (this.aseli) {
            return null;
        }
        return this.mfb;
    }

    public Integer getMfbAsInteger() {
        if (this.aseli) {
            return null;
        }
        return Integer.valueOf(this.mfb.byteValue());
    }

    public byte getMfsi() {
        return this.mfsi;
    }

    public int getMfsiAsInt() {
        return this.mfsi;
    }

    public byte[] getRawData() {
        byte[] bArr = new byte[2];
        byte rawData = (byte) (((this.aseli ? ASELI : this.mai.getRawData()) << 2) | (this.mfsi << 6));
        bArr[0] = rawData;
        if (this.trq) {
            bArr[0] = (byte) (2 | rawData);
        }
        if (this.vhtMfb) {
            bArr[0] = (byte) (bArr[0] | 1);
        }
        byte bByteValue = (byte) (this.mfb.byteValue() << 1);
        bArr[1] = bByteValue;
        if ((this.mfsi & 4) != 0) {
            bArr[1] = (byte) (bByteValue | 1);
        }
        return bArr;
    }

    public int hashCode() {
        Mai mai = this.mai;
        return ((((((((this.mfb.hashCode() + (((mai == null ? 0 : mai.hashCode()) + 31) * 31)) * 31) + this.mfsi) * 31) + (this.aseli ? 1231 : 1237)) * 31) + (this.vhtMfb ? 1231 : 1237)) * 31) + (this.trq ? 1231 : 1237);
    }

    public boolean isAselIndicated() {
        return this.aseli;
    }

    public boolean isTrq() {
        return this.trq;
    }

    public boolean isVhtMfb() {
        return this.vhtMfb;
    }

    public int length() {
        return 2;
    }

    public String toString() {
        StringBuilder sbA = o40.A(250, "[VHT_MFB: ");
        sbA.append(this.vhtMfb);
        sbA.append(", TRQ: ");
        sbA.append(this.trq);
        sbA.append(", ASELI: ");
        sbA.append(this.aseli);
        if (!this.aseli) {
            sbA.append(", MAI: ");
            sbA.append(this.mai);
        }
        sbA.append(", MFSI: ");
        sbA.append((int) this.mfsi);
        if (this.aseli) {
            sbA.append(", ASELC: ");
            sbA.append(this.aselc);
        } else {
            sbA.append(", MFB: ");
            sbA.append(this.mfb);
        }
        sbA.append("]");
        return sbA.toString();
    }

    private Dot11LinkAdaptationControl(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 2) {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a Dot11LinkAdaptationControl (2 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        this.vhtMfb = (b & 1) != 0;
        this.trq = (b & 2) != 0;
        boolean z = ((b >> 2) & 15) == 14;
        this.aseli = z;
        if (z) {
            this.mai = null;
        } else {
            this.mai = new Mai((b & 4) != 0, (byte) ((b >> 3) & 7));
        }
        this.mfsi = (byte) (((b >> 6) & 3) | ((b2 & 1) << 2));
        byte b3 = (byte) ((b2 >> 1) & 127);
        this.mfb = Byte.valueOf(b3);
        this.aselc = new Aselc(b3);
    }

    public static final class Mai implements Serializable {
        private static final long serialVersionUID = -7417614720576047794L;
        private final boolean mrq;
        private final byte msi;

        public Mai(boolean z, byte b) {
            if (b < 0 || b > 6) {
                throw new IllegalArgumentException(rm7.n(b, "msi must be between 0 and 6 but is actually: "));
            }
            this.mrq = z;
            this.msi = b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Mai.class != obj.getClass()) {
                return false;
            }
            Mai mai = (Mai) obj;
            return this.mrq == mai.mrq && this.msi == mai.msi;
        }

        public byte getMsi() {
            return this.msi;
        }

        public byte getRawData() {
            return (byte) (this.mrq ? (this.msi << 1) | 1 : this.msi << 1);
        }

        public int hashCode() {
            return (((this.mrq ? 1231 : 1237) + 31) * 31) + this.msi;
        }

        public boolean isMrq() {
            return this.mrq;
        }

        public String toString() {
            StringBuilder sbA = o40.A(250, "[MRQ: ");
            sbA.append(this.mrq);
            sbA.append(", MSI: ");
            return dw1.k(this.msi, "]", sbA);
        }

        public Mai(byte b) {
            this.mrq = (b & 1) != 0;
            this.msi = (byte) ((b >> 1) & 7);
        }
    }

    public static final class Aselc implements Serializable {
        private static final long serialVersionUID = -5404846090809709793L;
        private final AselCommand command;
        private final byte data;

        public Aselc(AselCommand aselCommand, byte b) {
            if (aselCommand == null) {
                throw new IllegalArgumentException("command is null.");
            }
            if ((b & 240) != 0) {
                throw new IllegalArgumentException(rm7.n(b, "(data & 0xF0) must be zero. data: "));
            }
            this.command = aselCommand;
            this.data = b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Aselc.class != obj.getClass()) {
                return false;
            }
            Aselc aselc = (Aselc) obj;
            return this.command == aselc.command && this.data == aselc.data;
        }

        public AselCommand getCommand() {
            return this.command;
        }

        public byte getData() {
            return this.data;
        }

        public byte getRawData() {
            return (byte) ((this.command.value << 4) | this.data);
        }

        public int hashCode() {
            return ((this.command.hashCode() + 31) * 31) + this.data;
        }

        public String toString() {
            StringBuilder sbA = o40.A(250, "[ASEL Command: ");
            sbA.append(this.command);
            sbA.append(", ASEL Data: ");
            return dw1.k(this.data, "]", sbA);
        }

        public Aselc(byte b) {
            this.command = AselCommand.getInstance(b & 7);
            this.data = (byte) ((b >> 3) & 15);
        }
    }

    private Dot11LinkAdaptationControl(Builder builder) {
        if (builder != null) {
            if ((builder.maiOrAseli & 240) == 0) {
                if ((builder.mfsi & 248) == 0) {
                    if ((builder.mfbOrAselc & 128) == 0) {
                        this.vhtMfb = builder.vhtMfb;
                        this.trq = builder.trq;
                        boolean z = builder.maiOrAseli == 14;
                        this.aseli = z;
                        if (z) {
                            this.mai = null;
                        } else {
                            this.mai = new Mai(builder.maiOrAseli);
                        }
                        this.mfsi = builder.mfsi;
                        this.mfb = Byte.valueOf(builder.mfbOrAselc);
                        this.aselc = new Aselc(builder.mfbOrAselc);
                        return;
                    }
                    throw new IllegalArgumentException("(builder.mfbOrAselc & 0x80) must be zero. builder.mfbOrAselc: " + ((int) builder.mfbOrAselc));
                }
                throw new IllegalArgumentException("(builder.mfsi & 0xF8) must be zero. builder.mfsi: " + ((int) builder.mfsi));
            }
            throw new IllegalArgumentException("(builder.maiOrAseli & 0xF0) must be zero. builder.maiOrAseli: " + ((int) builder.maiOrAseli));
        }
        throw new NullPointerException("builder is null.");
    }
}
