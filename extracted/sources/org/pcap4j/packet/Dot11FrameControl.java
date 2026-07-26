package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.Serializable;
import org.pcap4j.packet.namednumber.Dot11FrameType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11FrameControl implements Serializable {
    private static final long serialVersionUID = -5402534865955179413L;
    private final boolean fromDs;
    private final boolean moreData;
    private final boolean moreFragments;
    private final boolean order;
    private final boolean powerManagement;
    private final boolean protectedFrame;
    private final ProtocolVersion protocolVersion;
    private final boolean retry;
    private final boolean toDs;
    private final Dot11FrameType type;

    public static final class Builder {
        private boolean fromDs;
        private boolean moreData;
        private boolean moreFragments;
        private boolean order;
        private boolean powerManagement;
        private boolean protectedFrame;
        private ProtocolVersion protocolVersion;
        private boolean retry;
        private boolean toDs;
        private Dot11FrameType type;

        public Dot11FrameControl build() {
            return new Dot11FrameControl(this);
        }

        public Builder fromDs(boolean z) {
            this.fromDs = z;
            return this;
        }

        public Builder moreData(boolean z) {
            this.moreData = z;
            return this;
        }

        public Builder moreFragments(boolean z) {
            this.moreFragments = z;
            return this;
        }

        public Builder order(boolean z) {
            this.order = z;
            return this;
        }

        public Builder powerManagement(boolean z) {
            this.powerManagement = z;
            return this;
        }

        public Builder protectedFrame(boolean z) {
            this.protectedFrame = z;
            return this;
        }

        public Builder protocolVersion(ProtocolVersion protocolVersion) {
            this.protocolVersion = protocolVersion;
            return this;
        }

        public Builder retry(boolean z) {
            this.retry = z;
            return this;
        }

        public Builder toDs(boolean z) {
            this.toDs = z;
            return this;
        }

        public Builder type(Dot11FrameType dot11FrameType) {
            this.type = dot11FrameType;
            return this;
        }

        public Builder() {
        }

        private Builder(Dot11FrameControl dot11FrameControl) {
            this.protocolVersion = dot11FrameControl.protocolVersion;
            this.type = dot11FrameControl.type;
            this.toDs = dot11FrameControl.toDs;
            this.fromDs = dot11FrameControl.fromDs;
            this.moreFragments = dot11FrameControl.moreFragments;
            this.retry = dot11FrameControl.retry;
            this.powerManagement = dot11FrameControl.powerManagement;
            this.moreData = dot11FrameControl.moreData;
            this.protectedFrame = dot11FrameControl.protectedFrame;
            this.order = dot11FrameControl.order;
        }
    }

    public enum ProtocolVersion {
        V0(0),
        V1(1),
        V2(2),
        V3(3);

        private final int value;

        ProtocolVersion(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static Dot11FrameControl newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Dot11FrameControl(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Dot11FrameControl.class != obj.getClass()) {
            return false;
        }
        Dot11FrameControl dot11FrameControl = (Dot11FrameControl) obj;
        return this.fromDs == dot11FrameControl.fromDs && this.moreData == dot11FrameControl.moreData && this.moreFragments == dot11FrameControl.moreFragments && this.order == dot11FrameControl.order && this.powerManagement == dot11FrameControl.powerManagement && this.protectedFrame == dot11FrameControl.protectedFrame && this.protocolVersion == dot11FrameControl.protocolVersion && this.retry == dot11FrameControl.retry && this.toDs == dot11FrameControl.toDs && this.type.equals(dot11FrameControl.type);
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public ProtocolVersion getProtocolVersion() {
        return this.protocolVersion;
    }

    public byte[] getRawData() {
        byte b = (byte) (bArr[0] | this.protocolVersion.value);
        byte[] bArr = {b, 0};
        byte value = (byte) (b | (this.type.getType().getValue() << 2));
        bArr[0] = value;
        bArr[0] = (byte) (value | (this.type.value().byteValue() << 4));
        if (this.toDs) {
            bArr[1] = (byte) (bArr[1] | 1);
        }
        if (this.fromDs) {
            bArr[1] = (byte) (2 | bArr[1]);
        }
        if (this.moreFragments) {
            bArr[1] = (byte) (bArr[1] | 4);
        }
        if (this.retry) {
            bArr[1] = (byte) (bArr[1] | 8);
        }
        if (this.powerManagement) {
            bArr[1] = (byte) (bArr[1] | 16);
        }
        if (this.moreData) {
            bArr[1] = (byte) (bArr[1] | 32);
        }
        if (this.protectedFrame) {
            bArr[1] = (byte) (bArr[1] | 64);
        }
        if (this.order) {
            bArr[1] = (byte) (bArr[1] | 128);
        }
        return bArr;
    }

    public Dot11FrameType getType() {
        return this.type;
    }

    public int hashCode() {
        int i = ((((((((((((this.fromDs ? 1231 : 1237) + 31) * 31) + (this.moreData ? 1231 : 1237)) * 31) + (this.moreFragments ? 1231 : 1237)) * 31) + (this.order ? 1231 : 1237)) * 31) + (this.powerManagement ? 1231 : 1237)) * 31) + (this.protectedFrame ? 1231 : 1237)) * 31;
        ProtocolVersion protocolVersion = this.protocolVersion;
        int iHashCode = (((((i + (protocolVersion == null ? 0 : protocolVersion.hashCode())) * 31) + (this.retry ? 1231 : 1237)) * 31) + (this.toDs ? 1231 : 1237)) * 31;
        Dot11FrameType dot11FrameType = this.type;
        return iHashCode + (dot11FrameType != null ? dot11FrameType.hashCode() : 0);
    }

    public boolean isFromDs() {
        return this.fromDs;
    }

    public boolean isMoreData() {
        return this.moreData;
    }

    public boolean isMoreFragments() {
        return this.moreFragments;
    }

    public boolean isOrder() {
        return this.order;
    }

    public boolean isPowerManagement() {
        return this.powerManagement;
    }

    public boolean isProtectedFrame() {
        return this.protectedFrame;
    }

    public boolean isRetry() {
        return this.retry;
    }

    public boolean isToDs() {
        return this.toDs;
    }

    public int length() {
        return 2;
    }

    public String toString() {
        return toString("");
    }

    private Dot11FrameControl(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        if (i2 < 2) {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a Dot11FrameControl (2 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            throw new IllegalRawDataException(sbA.toString());
        }
        byte b = bArr[i];
        int i3 = b & 3;
        if (i3 == 0) {
            this.protocolVersion = ProtocolVersion.V0;
        } else if (i3 == 1) {
            this.protocolVersion = ProtocolVersion.V1;
        } else if (i3 == 2) {
            this.protocolVersion = ProtocolVersion.V2;
        } else {
            if (i3 != 3) {
                throw new AssertionError("Never get here.");
            }
            this.protocolVersion = ProtocolVersion.V3;
        }
        this.type = Dot11FrameType.getInstance(Byte.valueOf((byte) (((b >> 4) & 15) | ((b << 2) & 48))));
        byte b2 = bArr[i + 1];
        this.toDs = (b2 & 1) != 0;
        this.fromDs = (b2 & 2) != 0;
        this.moreFragments = (b2 & 4) != 0;
        this.retry = (b2 & 8) != 0;
        this.powerManagement = (b2 & 16) != 0;
        this.moreData = (b2 & 32) != 0;
        this.protectedFrame = (b2 & 64) != 0;
        this.order = (b2 & 128) != 0;
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb.append(str);
        sb.append("Protocol Version: ");
        sb.append(this.protocolVersion);
        sb.append(property);
        sb.append(str);
        sb.append("Type/Subtype: ");
        sb.append(this.type);
        sb.append(property);
        sb.append(str);
        sb.append("To DS: ");
        t61.z(sb, this.toDs, property, str, "From DS: ");
        t61.z(sb, this.fromDs, property, str, "More Fragments: ");
        t61.z(sb, this.moreFragments, property, str, "Retry: ");
        t61.z(sb, this.retry, property, str, "Power Management: ");
        t61.z(sb, this.powerManagement, property, str, "More Data: ");
        t61.z(sb, this.moreData, property, str, "Protected Frame: ");
        t61.z(sb, this.protectedFrame, property, str, "Order: ");
        return t61.l(sb, this.order, property);
    }

    private Dot11FrameControl(Builder builder) {
        if (builder != null && builder.protocolVersion != null && builder.type != null) {
            this.protocolVersion = builder.protocolVersion;
            this.type = builder.type;
            this.toDs = builder.toDs;
            this.fromDs = builder.fromDs;
            this.moreFragments = builder.moreFragments;
            this.retry = builder.retry;
            this.powerManagement = builder.powerManagement;
            this.moreData = builder.moreData;
            this.protectedFrame = builder.protectedFrame;
            this.order = builder.order;
            return;
        }
        throw new NullPointerException("builder" + builder + " builder.protocolVersion: " + builder.protocolVersion + " builder.type: " + builder.type);
    }
}
