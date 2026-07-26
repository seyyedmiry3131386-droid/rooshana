package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.Serializable;
import org.pcap4j.packet.factory.PacketFactories;
import org.pcap4j.packet.namednumber.DnsClass;
import org.pcap4j.packet.namednumber.DnsResourceRecordType;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsResourceRecord implements Serializable {
    private static final long serialVersionUID = 4951400991563055073L;
    private final DnsClass dataClass;
    private final DnsResourceRecordType dataType;
    private final DnsDomainName name;
    private final DnsRData rData;
    private final short rdLength;
    private final int ttl;

    public static final class Builder implements LengthBuilder<DnsResourceRecord> {
        private boolean correctLengthAtBuild;
        private DnsClass dataClass;
        private DnsResourceRecordType dataType;
        private DnsDomainName name;
        private DnsRData rData;
        private short rdLength;
        private int ttl;

        @Override // org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<DnsResourceRecord> correctLengthAtBuild2(boolean z) {
            this.correctLengthAtBuild = z;
            return this;
        }

        public Builder dataClass(DnsClass dnsClass) {
            this.dataClass = dnsClass;
            return this;
        }

        public Builder dataType(DnsResourceRecordType dnsResourceRecordType) {
            this.dataType = dnsResourceRecordType;
            return this;
        }

        public Builder name(DnsDomainName dnsDomainName) {
            this.name = dnsDomainName;
            return this;
        }

        public Builder rData(DnsRData dnsRData) {
            this.rData = dnsRData;
            return this;
        }

        public Builder rdLength(short s) {
            this.rdLength = s;
            return this;
        }

        public Builder ttl(int i) {
            this.ttl = i;
            return this;
        }

        public Builder() {
            this.correctLengthAtBuild = false;
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public DnsResourceRecord build() {
            return new DnsResourceRecord(this);
        }

        private Builder(DnsResourceRecord dnsResourceRecord) {
            this.correctLengthAtBuild = false;
            this.name = dnsResourceRecord.name;
            this.dataType = dnsResourceRecord.dataType;
            this.dataClass = dnsResourceRecord.dataClass;
            this.ttl = dnsResourceRecord.ttl;
            this.rdLength = dnsResourceRecord.rdLength;
            this.rData = dnsResourceRecord.rData;
        }
    }

    public interface DnsRData extends Serializable {
        byte[] getRawData();

        int length();

        String toString(String str);

        String toString(String str, byte[] bArr);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private String convertToString(String str, byte[] bArr) {
        String string;
        StringBuilder sb = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb.append(str);
        sb.append("NAME: ");
        DnsDomainName dnsDomainName = this.name;
        DnsDomainName string2 = dnsDomainName;
        if (bArr != null) {
            string2 = dnsDomainName.toString(bArr);
        }
        sb.append(string2);
        sb.append(property);
        sb.append(str);
        sb.append("TYPE: ");
        sb.append(this.dataType);
        sb.append(property);
        sb.append(str);
        sb.append("CLASS: ");
        sb.append(this.dataClass);
        sb.append(property);
        sb.append(str);
        sb.append("TTL: ");
        sb.append(getTtlAsLong());
        sb.append(property);
        sb.append(str);
        sb.append("RDLENGTH: ");
        sb.append(getRdLengthAsInt());
        sb.append(property);
        if (this.rData != null) {
            t61.y(sb, str, "RDATA:", property);
            if (bArr != null) {
                string = this.rData.toString(str + "  ", bArr);
            } else {
                string = this.rData.toString(str + "  ");
            }
            sb.append(string);
        }
        return sb.toString();
    }

    public static DnsResourceRecord newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsResourceRecord(bArr, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DnsResourceRecord.class == obj.getClass()) {
            DnsResourceRecord dnsResourceRecord = (DnsResourceRecord) obj;
            if (this.ttl != dnsResourceRecord.ttl || this.rdLength != dnsResourceRecord.rdLength || !this.name.equals(dnsResourceRecord.name) || !this.dataType.equals(dnsResourceRecord.dataType) || !this.dataClass.equals(dnsResourceRecord.dataClass)) {
                return false;
            }
            DnsRData dnsRData = this.rData;
            DnsRData dnsRData2 = dnsResourceRecord.rData;
            if (dnsRData != null) {
                return dnsRData.equals(dnsRData2);
            }
            if (dnsRData2 == null) {
                return true;
            }
        }
        return false;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public DnsClass getDataClass() {
        return this.dataClass;
    }

    public DnsResourceRecordType getDataType() {
        return this.dataType;
    }

    public DnsDomainName getName() {
        return this.name;
    }

    public DnsRData getRData() {
        return this.rData;
    }

    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        byte[] rawData = this.name.getRawData();
        System.arraycopy(rawData, 0, bArr, 0, rawData.length);
        int length = rawData.length;
        System.arraycopy(ByteArrays.toByteArray(this.dataType.value().shortValue()), 0, bArr, length, 2);
        System.arraycopy(ByteArrays.toByteArray(this.dataClass.value().shortValue()), 0, bArr, length + 2, 2);
        System.arraycopy(ByteArrays.toByteArray(this.ttl), 0, bArr, length + 4, 4);
        System.arraycopy(ByteArrays.toByteArray(this.rdLength), 0, bArr, length + 8, 2);
        DnsRData dnsRData = this.rData;
        if (dnsRData != null) {
            byte[] rawData2 = dnsRData.getRawData();
            System.arraycopy(rawData2, 0, bArr, length + 10, rawData2.length);
        }
        return bArr;
    }

    public short getRdLength() {
        return this.rdLength;
    }

    public int getRdLengthAsInt() {
        return this.rdLength & 65535;
    }

    public int getTtl() {
        return this.ttl;
    }

    public long getTtlAsLong() {
        return ((long) this.ttl) & 4294967295L;
    }

    public int hashCode() {
        int iHashCode = (((((this.dataClass.hashCode() + ((this.dataType.hashCode() + (this.name.hashCode() * 31)) * 31)) * 31) + this.ttl) * 31) + this.rdLength) * 31;
        DnsRData dnsRData = this.rData;
        return iHashCode + (dnsRData != null ? dnsRData.hashCode() : 0);
    }

    public int length() {
        DnsRData dnsRData = this.rData;
        return this.name.length() + 10 + (dnsRData == null ? 0 : dnsRData.length());
    }

    public String toString() {
        return convertToString("", null);
    }

    private DnsResourceRecord(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        DnsDomainName dnsDomainNameNewInstance = DnsDomainName.newInstance(bArr, i, i2);
        this.name = dnsDomainNameNewInstance;
        int length = dnsDomainNameNewInstance.length();
        if (i2 - length < 10) {
            StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build type, class, ttl, and rdlength of DnsResourceRecord. data: ");
            t61.t(i, " ", ", offset: ", sbA, bArr);
            sbA.append(", length: ");
            sbA.append(i2);
            sbA.append(", cursor: ");
            sbA.append(length);
            throw new IllegalRawDataException(sbA.toString());
        }
        DnsResourceRecordType dnsResourceRecordType = DnsResourceRecordType.getInstance(Short.valueOf(ByteArrays.getShort(bArr, i + length)));
        this.dataType = dnsResourceRecordType;
        this.dataClass = DnsClass.getInstance(Short.valueOf(ByteArrays.getShort(bArr, length + 2 + i)));
        this.ttl = ByteArrays.getInt(bArr, length + 4 + i);
        this.rdLength = ByteArrays.getShort(bArr, length + 8 + i);
        int i3 = length + 10;
        int rdLengthAsInt = getRdLengthAsInt();
        if (i2 - i3 >= rdLengthAsInt) {
            if (rdLengthAsInt != 0) {
                this.rData = (DnsRData) PacketFactories.getFactory(DnsRData.class, DnsResourceRecordType.class).newInstance(bArr, i + i3, rdLengthAsInt, dnsResourceRecordType);
                return;
            } else {
                this.rData = null;
                return;
            }
        }
        StringBuilder sb = new StringBuilder(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR);
        sb.append("The data is too short to build rData of DnsResourceRecord (");
        sb.append(rdLengthAsInt);
        sb.append(" bytes). data: ");
        t61.t(i, " ", ", offset: ", sb, bArr);
        sb.append(", length: ");
        sb.append(i2);
        sb.append(", cursor: ");
        sb.append(i3);
        sb.append(", dataType: ");
        sb.append(dnsResourceRecordType);
        throw new IllegalRawDataException(sb.toString());
    }

    public String toString(String str) {
        return convertToString(str, null);
    }

    public String toString(String str, byte[] bArr) {
        if (bArr != null) {
            return convertToString(str, bArr);
        }
        throw new NullPointerException("headerRawData is null.");
    }

    private DnsResourceRecord(Builder builder) {
        if (builder != null && builder.name != null && builder.dataType != null && builder.dataClass != null) {
            this.name = builder.name;
            this.dataType = builder.dataType;
            this.dataClass = builder.dataClass;
            this.ttl = builder.ttl;
            DnsRData dnsRData = builder.rData;
            this.rData = dnsRData;
            if (!builder.correctLengthAtBuild) {
                this.rdLength = builder.rdLength;
                return;
            }
            int length = dnsRData == null ? 0 : dnsRData.length();
            if (((-65536) & length) == 0) {
                this.rdLength = (short) length;
                return;
            } else {
                throw new IllegalArgumentException("(rData.length() & 0xFFFF0000) must be zero. rData: " + dnsRData);
            }
        }
        throw new NullPointerException("builder" + builder + " builder.name: " + builder.name + " builder.dataType: " + builder.dataType + " builder.dataClass: " + builder.dataClass);
    }
}
