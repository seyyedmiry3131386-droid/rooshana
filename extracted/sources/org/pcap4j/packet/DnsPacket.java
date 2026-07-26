package org.pcap4j.packet;

import defpackage.o40;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.packet.namednumber.DnsOpCode;
import org.pcap4j.packet.namednumber.DnsRCode;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsPacket extends AbstractPacket {
    private static final long serialVersionUID = 2804715680374557063L;
    private final DnsHeader header;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private List<DnsResourceRecord> additionalInfo;
        private short anCount;
        private List<DnsResourceRecord> answers;
        private short arCount;
        private boolean authenticData;
        private boolean authoritativeAnswer;
        private List<DnsResourceRecord> authorities;
        private boolean checkingDisabled;
        private short id;
        private short nsCount;
        private DnsOpCode opCode;
        private short qdCount;
        private List<DnsQuestion> questions;
        private DnsRCode rCode;
        private boolean recursionAvailable;
        private boolean recursionDesired;
        private boolean reserved;
        private boolean response;
        private boolean truncated;

        public Builder additionalInfo(List<DnsResourceRecord> list) {
            this.additionalInfo = list;
            return this;
        }

        public Builder anCount(short s) {
            this.anCount = s;
            return this;
        }

        public Builder answers(List<DnsResourceRecord> list) {
            this.answers = list;
            return this;
        }

        public Builder arCount(short s) {
            this.arCount = s;
            return this;
        }

        public Builder authenticData(boolean z) {
            this.authenticData = z;
            return this;
        }

        public Builder authoritativeAnswer(boolean z) {
            this.authoritativeAnswer = z;
            return this;
        }

        public Builder authorities(List<DnsResourceRecord> list) {
            this.authorities = list;
            return this;
        }

        public Builder checkingDisabled(boolean z) {
            this.checkingDisabled = z;
            return this;
        }

        public Builder id(short s) {
            this.id = s;
            return this;
        }

        public Builder nsCount(short s) {
            this.nsCount = s;
            return this;
        }

        public Builder opCode(DnsOpCode dnsOpCode) {
            this.opCode = dnsOpCode;
            return this;
        }

        public Builder qdCount(short s) {
            this.qdCount = s;
            return this;
        }

        public Builder questions(List<DnsQuestion> list) {
            this.questions = list;
            return this;
        }

        public Builder rCode(DnsRCode dnsRCode) {
            this.rCode = dnsRCode;
            return this;
        }

        public Builder recursionAvailable(boolean z) {
            this.recursionAvailable = z;
            return this;
        }

        public Builder recursionDesired(boolean z) {
            this.recursionDesired = z;
            return this;
        }

        public Builder reserved(boolean z) {
            this.reserved = z;
            return this;
        }

        public Builder response(boolean z) {
            this.response = z;
            return this;
        }

        public Builder truncated(boolean z) {
            this.truncated = z;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public DnsPacket build() {
            return new DnsPacket(this);
        }

        private Builder(DnsPacket dnsPacket) {
            this.id = dnsPacket.header.id;
            this.response = dnsPacket.header.response;
            this.opCode = dnsPacket.header.opCode;
            this.authoritativeAnswer = dnsPacket.header.authoritativeAnswer;
            this.truncated = dnsPacket.header.truncated;
            this.recursionDesired = dnsPacket.header.recursionDesired;
            this.recursionAvailable = dnsPacket.header.recursionAvailable;
            this.reserved = dnsPacket.header.reserved;
            this.authenticData = dnsPacket.header.authenticData;
            this.checkingDisabled = dnsPacket.header.checkingDisabled;
            this.rCode = dnsPacket.header.rCode;
            this.qdCount = dnsPacket.header.qdCount;
            this.anCount = dnsPacket.header.anCount;
            this.nsCount = dnsPacket.header.nsCount;
            this.arCount = dnsPacket.header.arCount;
            this.questions = dnsPacket.header.questions;
            this.answers = dnsPacket.header.answers;
            this.authorities = dnsPacket.header.authorities;
            this.additionalInfo = dnsPacket.header.additionalInfo;
        }
    }

    public static DnsPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new DnsPacket(bArr, i, i2);
    }

    public static final class DnsHeader extends AbstractPacket.AbstractHeader {
        private static final int ANCOUNT_OFFSET = 6;
        private static final int ANCOUNT_SIZE = 2;
        private static final int ARCOUNT_OFFSET = 10;
        private static final int ARCOUNT_SIZE = 2;
        private static final int DNS_MIN_HEADER_SIZE = 12;
        private static final int FLAGS_OFFSET = 2;
        private static final int FLAGS_SIZE = 2;
        private static final int ID_OFFSET = 0;
        private static final int ID_SIZE = 2;
        private static final int NSCOUNT_OFFSET = 8;
        private static final int NSCOUNT_SIZE = 2;
        private static final int QDCOUNT_OFFSET = 4;
        private static final int QDCOUNT_SIZE = 2;
        private static final long serialVersionUID = -2779530760536525672L;
        private final List<DnsResourceRecord> additionalInfo;
        private final short anCount;
        private final List<DnsResourceRecord> answers;
        private final short arCount;
        private final boolean authenticData;
        private final boolean authoritativeAnswer;
        private final List<DnsResourceRecord> authorities;
        private final boolean checkingDisabled;
        private final short id;
        private final short nsCount;
        private final DnsOpCode opCode;
        private final short qdCount;
        private final List<DnsQuestion> questions;
        private final DnsRCode rCode;
        private final boolean recursionAvailable;
        private final boolean recursionDesired;
        private final boolean reserved;
        private final boolean response;
        private final boolean truncated;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[DNS Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            sb.append("  ID: ");
            sb.append("0x" + ByteArrays.toHexString(this.id, ""));
            sb.append(property);
            sb.append("  QR: ");
            t61.y(sb, this.response ? "response" : "query", property, "  OPCODE: ");
            sb.append(this.opCode);
            sb.append(property);
            sb.append("  Authoritative Answer: ");
            o40.K(sb, this.authoritativeAnswer, property, "  Truncated: ");
            o40.K(sb, this.truncated, property, "  Recursion Desired: ");
            o40.K(sb, this.recursionDesired, property, "  Recursion Available: ");
            o40.K(sb, this.recursionAvailable, property, "  Reserved Bit: ");
            sb.append(this.reserved ? 1 : 0);
            sb.append(property);
            sb.append("  Authentic Data: ");
            o40.K(sb, this.authenticData, property, "  Checking Disabled: ");
            o40.K(sb, this.checkingDisabled, property, "  RCODE: ");
            sb.append(this.rCode);
            sb.append(property);
            sb.append("  QDCOUNT: ");
            sb.append((int) this.qdCount);
            sb.append(property);
            sb.append("  ANCOUNT: ");
            sb.append((int) this.anCount);
            sb.append(property);
            sb.append("  NSCOUNT: ");
            sb.append((int) this.nsCount);
            sb.append(property);
            sb.append("  ARCOUNT: ");
            sb.append((int) this.arCount);
            sb.append(property);
            byte[] rawData = getRawData();
            for (DnsQuestion dnsQuestion : this.questions) {
                sb.append("  Question:");
                sb.append(property);
                sb.append(dnsQuestion.toString("    ", rawData));
            }
            for (DnsResourceRecord dnsResourceRecord : this.answers) {
                sb.append("  Answer:");
                sb.append(property);
                sb.append(dnsResourceRecord.toString("    ", rawData));
            }
            for (DnsResourceRecord dnsResourceRecord2 : this.authorities) {
                sb.append("  Authority:");
                sb.append(property);
                sb.append(dnsResourceRecord2.toString("    ", rawData));
            }
            for (DnsResourceRecord dnsResourceRecord3 : this.additionalInfo) {
                sb.append("  Additional:");
                sb.append(property);
                sb.append(dnsResourceRecord3.toString("    ", rawData));
            }
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return ((((((((((this.rCode.hashCode() + ((this.questions.hashCode() + ((((this.opCode.hashCode() + ((((((((this.authorities.hashCode() + ((((((((this.answers.hashCode() + ((((this.additionalInfo.hashCode() + 527) * 31) + this.anCount) * 31)) * 31) + this.arCount) * 31) + (this.authenticData ? 1231 : 1237)) * 31) + (this.authoritativeAnswer ? 1231 : 1237)) * 31)) * 31) + (this.checkingDisabled ? 1231 : 1237)) * 31) + this.id) * 31) + this.nsCount) * 31)) * 31) + this.qdCount) * 31)) * 31)) * 31) + (this.recursionAvailable ? 1231 : 1237)) * 31) + (this.recursionDesired ? 1231 : 1237)) * 31) + (this.reserved ? 1231 : 1237)) * 31) + (this.response ? 1231 : 1237)) * 31) + (this.truncated ? 1231 : 1237);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!super.equals(obj) || DnsHeader.class != obj.getClass()) {
                return false;
            }
            DnsHeader dnsHeader = (DnsHeader) obj;
            return this.additionalInfo.equals(dnsHeader.additionalInfo) && this.anCount == dnsHeader.anCount && this.answers.equals(dnsHeader.answers) && this.arCount == dnsHeader.arCount && this.authenticData == dnsHeader.authenticData && this.authoritativeAnswer == dnsHeader.authoritativeAnswer && this.authorities.equals(dnsHeader.authorities) && this.checkingDisabled == dnsHeader.checkingDisabled && this.id == dnsHeader.id && this.nsCount == dnsHeader.nsCount && this.opCode.equals(dnsHeader.opCode) && this.qdCount == dnsHeader.qdCount && this.questions.equals(dnsHeader.questions) && this.rCode.equals(dnsHeader.rCode) && this.recursionAvailable == dnsHeader.recursionAvailable && this.recursionDesired == dnsHeader.recursionDesired && this.reserved == dnsHeader.reserved && this.response == dnsHeader.response && this.truncated == dnsHeader.truncated;
        }

        public List<DnsResourceRecord> getAdditionalInfo() {
            return new ArrayList(this.additionalInfo);
        }

        public short getAnCount() {
            return this.anCount;
        }

        public int getAnCountAsInt() {
            return this.anCount & 65535;
        }

        public List<DnsResourceRecord> getAnswers() {
            return new ArrayList(this.answers);
        }

        public short getArCount() {
            return this.arCount;
        }

        public int getArCountAsInt() {
            return this.arCount & 65535;
        }

        public List<DnsResourceRecord> getAuthorities() {
            return new ArrayList(this.authorities);
        }

        public short getId() {
            return this.id;
        }

        public short getNsCount() {
            return this.nsCount;
        }

        public int getNsCountAsInt() {
            return this.nsCount & 65535;
        }

        public DnsOpCode getOpCode() {
            return this.opCode;
        }

        public short getQdCount() {
            return this.qdCount;
        }

        public int getQdCountAsInt() {
            return this.qdCount & 65535;
        }

        public List<DnsQuestion> getQuestions() {
            return new ArrayList(this.questions);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteArrays.toByteArray(this.id));
            byte[] bArr = new byte[2];
            byte bByteValue = (byte) (this.opCode.value().byteValue() << 3);
            bArr[0] = bByteValue;
            if (this.response) {
                bArr[0] = (byte) (bByteValue | 128);
            }
            if (this.authoritativeAnswer) {
                bArr[0] = (byte) (bArr[0] | 4);
            }
            if (this.truncated) {
                bArr[0] = (byte) (2 | bArr[0]);
            }
            if (this.recursionDesired) {
                bArr[0] = (byte) (bArr[0] | 1);
            }
            byte bByteValue2 = this.rCode.value().byteValue();
            bArr[1] = bByteValue2;
            if (this.recursionAvailable) {
                bArr[1] = (byte) (bByteValue2 | 128);
            }
            if (this.reserved) {
                bArr[1] = (byte) (bArr[1] | 64);
            }
            if (this.authenticData) {
                bArr[1] = (byte) (bArr[1] | 32);
            }
            if (this.checkingDisabled) {
                bArr[1] = (byte) (bArr[1] | 16);
            }
            arrayList.add(bArr);
            arrayList.add(ByteArrays.toByteArray(this.qdCount));
            arrayList.add(ByteArrays.toByteArray(this.anCount));
            arrayList.add(ByteArrays.toByteArray(this.nsCount));
            arrayList.add(ByteArrays.toByteArray(this.arCount));
            Iterator<DnsQuestion> it = this.questions.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRawData());
            }
            Iterator<DnsResourceRecord> it2 = this.answers.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getRawData());
            }
            Iterator<DnsResourceRecord> it3 = this.authorities.iterator();
            while (it3.hasNext()) {
                arrayList.add(it3.next().getRawData());
            }
            Iterator<DnsResourceRecord> it4 = this.additionalInfo.iterator();
            while (it4.hasNext()) {
                arrayList.add(it4.next().getRawData());
            }
            return arrayList;
        }

        public boolean getReservedBit() {
            return this.reserved;
        }

        public DnsRCode getrCode() {
            return this.rCode;
        }

        public boolean isAuthenticData() {
            return this.authenticData;
        }

        public boolean isAuthoritativeAnswer() {
            return this.authoritativeAnswer;
        }

        public boolean isCheckingDisabled() {
            return this.checkingDisabled;
        }

        public boolean isRecursionAvailable() {
            return this.recursionAvailable;
        }

        public boolean isRecursionDesired() {
            return this.recursionDesired;
        }

        public boolean isResponse() {
            return this.response;
        }

        public boolean isTruncated() {
            return this.truncated;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader, org.pcap4j.packet.Packet.Header
        public int length() {
            Iterator<DnsQuestion> it = this.questions.iterator();
            int length = 12;
            while (it.hasNext()) {
                length += it.next().length();
            }
            Iterator<DnsResourceRecord> it2 = this.answers.iterator();
            while (it2.hasNext()) {
                length += it2.next().length();
            }
            Iterator<DnsResourceRecord> it3 = this.authorities.iterator();
            while (it3.hasNext()) {
                length += it3.next().length();
            }
            Iterator<DnsResourceRecord> it4 = this.additionalInfo.iterator();
            while (it4.hasNext()) {
                length += it4.next().length();
            }
            return length;
        }

        private DnsHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            int length = 12;
            if (i2 >= 12) {
                this.id = ByteArrays.getShort(bArr, i);
                short s = ByteArrays.getShort(bArr, i + 2);
                this.response = (Short.MIN_VALUE & s) != 0;
                this.opCode = DnsOpCode.getInstance(Byte.valueOf((byte) ((s >> 11) & 15)));
                this.authoritativeAnswer = (s & 1024) != 0;
                this.truncated = (s & 512) != 0;
                this.recursionDesired = (s & 256) != 0;
                this.recursionAvailable = (s & 128) != 0;
                this.reserved = (s & 64) != 0;
                this.authenticData = (s & 32) != 0;
                this.checkingDisabled = (s & 16) != 0;
                this.rCode = DnsRCode.getInstance(Byte.valueOf((byte) (s & 15)));
                this.qdCount = ByteArrays.getShort(bArr, i + 4);
                this.anCount = ByteArrays.getShort(bArr, i + 6);
                this.nsCount = ByteArrays.getShort(bArr, i + 8);
                this.arCount = ByteArrays.getShort(bArr, i + 10);
                int qdCountAsInt = getQdCountAsInt();
                int anCountAsInt = getAnCountAsInt();
                int nsCountAsInt = getNsCountAsInt();
                int arCountAsInt = getArCountAsInt();
                this.questions = new ArrayList(qdCountAsInt);
                this.answers = new ArrayList(anCountAsInt);
                this.authorities = new ArrayList(nsCountAsInt);
                this.additionalInfo = new ArrayList(arCountAsInt);
                for (int i3 = 0; i3 < qdCountAsInt; i3++) {
                    int i4 = i2 - length;
                    if (i4 != 0) {
                        DnsQuestion dnsQuestionNewInstance = DnsQuestion.newInstance(bArr, i + length, i4);
                        this.questions.add(dnsQuestionNewInstance);
                        length += dnsQuestionNewInstance.length();
                    } else {
                        StringBuilder sbA = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a question in DnsHeader. data: ");
                        t61.t(i, " ", ", offset: ", sbA, bArr);
                        sbA.append(", length: ");
                        sbA.append(i2);
                        sbA.append(", cursor: ");
                        sbA.append(length);
                        throw new IllegalRawDataException(sbA.toString());
                    }
                }
                for (int i5 = 0; i5 < anCountAsInt; i5++) {
                    int i6 = i2 - length;
                    if (i6 != 0) {
                        DnsResourceRecord dnsResourceRecordNewInstance = DnsResourceRecord.newInstance(bArr, i + length, i6);
                        this.answers.add(dnsResourceRecordNewInstance);
                        length += dnsResourceRecordNewInstance.length();
                    } else {
                        StringBuilder sbA2 = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build an answer in DnsHeader. data: ");
                        t61.t(i, " ", ", offset: ", sbA2, bArr);
                        sbA2.append(", length: ");
                        sbA2.append(i2);
                        sbA2.append(", cursor: ");
                        sbA2.append(length);
                        throw new IllegalRawDataException(sbA2.toString());
                    }
                }
                for (int i7 = 0; i7 < nsCountAsInt; i7++) {
                    int i8 = i2 - length;
                    if (i8 != 0) {
                        DnsResourceRecord dnsResourceRecordNewInstance2 = DnsResourceRecord.newInstance(bArr, i + length, i8);
                        this.authorities.add(dnsResourceRecordNewInstance2);
                        length += dnsResourceRecordNewInstance2.length();
                    } else {
                        StringBuilder sbA3 = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build an authority in DnsHeader. data: ");
                        t61.t(i, " ", ", offset: ", sbA3, bArr);
                        sbA3.append(", length: ");
                        sbA3.append(i2);
                        sbA3.append(", cursor: ");
                        sbA3.append(length);
                        throw new IllegalRawDataException(sbA3.toString());
                    }
                }
                for (int i9 = 0; i9 < arCountAsInt; i9++) {
                    int i10 = i2 - length;
                    if (i10 != 0) {
                        DnsResourceRecord dnsResourceRecordNewInstance3 = DnsResourceRecord.newInstance(bArr, i + length, i10);
                        this.additionalInfo.add(dnsResourceRecordNewInstance3);
                        length += dnsResourceRecordNewInstance3.length();
                    } else {
                        StringBuilder sbA4 = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build additional info in DnsHeader. data: ");
                        t61.t(i, " ", ", offset: ", sbA4, bArr);
                        sbA4.append(", length: ");
                        sbA4.append(i2);
                        sbA4.append(", cursor: ");
                        sbA4.append(length);
                        throw new IllegalRawDataException(sbA4.toString());
                    }
                }
                return;
            }
            StringBuilder sbA5 = o40.A(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, "The data is too short to build a DnsHeader (12 bytes). data: ");
            t61.t(i, " ", ", offset: ", sbA5, bArr);
            sbA5.append(", length: ");
            sbA5.append(i2);
            throw new IllegalRawDataException(sbA5.toString());
        }

        private DnsHeader(Builder builder) {
            this.id = builder.id;
            this.response = builder.response;
            this.opCode = builder.opCode;
            this.authoritativeAnswer = builder.authoritativeAnswer;
            this.truncated = builder.truncated;
            this.recursionDesired = builder.recursionDesired;
            this.recursionAvailable = builder.recursionAvailable;
            this.reserved = builder.reserved;
            this.authenticData = builder.authenticData;
            this.checkingDisabled = builder.checkingDisabled;
            this.rCode = builder.rCode;
            this.qdCount = builder.qdCount;
            this.anCount = builder.anCount;
            this.nsCount = builder.nsCount;
            this.arCount = builder.arCount;
            if (builder.questions != null) {
                if (builder.questions.size() > 65535) {
                    throw new IllegalArgumentException("The number of questions must be less than 65536. builder.questions.size(): " + builder.questions.size());
                }
                this.questions = new ArrayList(builder.questions);
            } else {
                this.questions = Collections.EMPTY_LIST;
            }
            if (builder.answers != null) {
                if (builder.answers.size() > 65535) {
                    throw new IllegalArgumentException("The number of answers must be less than 65536. builder.answers.size(): " + builder.answers.size());
                }
                this.answers = new ArrayList(builder.answers);
            } else {
                this.answers = Collections.EMPTY_LIST;
            }
            if (builder.authorities != null) {
                if (builder.authorities.size() > 65535) {
                    throw new IllegalArgumentException("The number of authorities must be less than 65536. builder.authorities.size(): " + builder.authorities.size());
                }
                this.authorities = new ArrayList(builder.authorities);
            } else {
                this.authorities = Collections.EMPTY_LIST;
            }
            if (builder.additionalInfo != null) {
                if (builder.additionalInfo.size() > 65535) {
                    throw new IllegalArgumentException("The number of additionalInfo elements must be less than 65536. builder.additionalInfo.size(): " + builder.additionalInfo.size());
                }
                this.additionalInfo = new ArrayList(builder.additionalInfo);
                return;
            }
            this.additionalInfo = Collections.EMPTY_LIST;
        }
    }

    private DnsPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new DnsHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public DnsHeader getHeader() {
        return this.header;
    }

    private DnsPacket(Builder builder) {
        if (builder != null && builder.opCode != null && builder.rCode != null) {
            this.header = new DnsHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.opCode: " + builder.opCode + " builder.rCode: " + builder.rCode);
    }
}
