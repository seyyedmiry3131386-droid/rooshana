package org.pcap4j.packet;

import defpackage.o40;
import defpackage.rm7;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.AbstractPacket;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Ssh2VersionExchangePacket extends AbstractPacket {
    private static final long serialVersionUID = 936170241296151065L;
    private final Ssh2VersionExchangeHeader header;

    public static final class Builder extends AbstractPacket.AbstractBuilder {
        private String comments;
        private List<String> messages;
        private String protoVersion;
        private String softwareVersion;

        public Builder comments(String str) {
            this.comments = str;
            return this;
        }

        public Builder messages(List<String> list) {
            this.messages = list;
            return this;
        }

        public Builder protoVersion(String str) {
            this.protoVersion = str;
            return this;
        }

        public Builder softwareVersion(String str) {
            this.softwareVersion = str;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Ssh2VersionExchangePacket build() {
            return new Ssh2VersionExchangePacket(this);
        }

        private Builder(Ssh2VersionExchangePacket ssh2VersionExchangePacket) {
            this.messages = ssh2VersionExchangePacket.header.messages;
            this.protoVersion = ssh2VersionExchangePacket.header.protoVersion;
            this.softwareVersion = ssh2VersionExchangePacket.header.softwareVersion;
            this.comments = ssh2VersionExchangePacket.header.comments;
        }
    }

    public static Ssh2VersionExchangePacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Ssh2VersionExchangePacket(bArr, i, i2);
    }

    public static final class Ssh2VersionExchangeHeader extends AbstractPacket.AbstractHeader {
        private static final long serialVersionUID = -997040469918475251L;
        private final String comments;
        private final List<String> messages;
        private final String protoVersion;
        private final String softwareVersion;

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder("[SSH2 Version Exchange Header (");
            String property = System.getProperty("line.separator");
            sb.append(length());
            sb.append(" bytes)]");
            sb.append(property);
            for (String str : getEntireMessage().split("\r\n")) {
                sb.append("  ");
                sb.append(str);
                sb.append(property);
            }
            return sb.toString();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            return this.comments.hashCode() + rm7.k(this.softwareVersion, rm7.k(this.protoVersion, (this.messages.hashCode() + 527) * 31, 31), 31);
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            return getEntireMessage().length();
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!Ssh2VersionExchangeHeader.class.isInstance(obj)) {
                return false;
            }
            Ssh2VersionExchangeHeader ssh2VersionExchangeHeader = (Ssh2VersionExchangeHeader) obj;
            return this.protoVersion.equals(ssh2VersionExchangeHeader.protoVersion) && this.softwareVersion.equals(ssh2VersionExchangeHeader.softwareVersion) && this.comments.equals(ssh2VersionExchangeHeader.comments) && this.messages.equals(ssh2VersionExchangeHeader.messages);
        }

        public String getComments() {
            return this.comments;
        }

        public String getEntireMessage() {
            StringBuilder sb = new StringBuilder(50);
            Iterator<String> it = this.messages.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append("\r\n");
            }
            sb.append("SSH-");
            sb.append(this.protoVersion);
            sb.append("-");
            sb.append(this.softwareVersion);
            if (this.comments.length() != 0) {
                sb.append(" ");
                sb.append(this.comments);
            }
            sb.append("\r\n");
            return sb.toString();
        }

        public ArrayList<String> getMessages() {
            return new ArrayList<>(this.messages);
        }

        public String getProtoVersion() {
            return this.protoVersion;
        }

        @Override // org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(getEntireMessage().getBytes());
            return arrayList;
        }

        public String getSoftwareVersion() {
            return this.softwareVersion;
        }

        private Ssh2VersionExchangeHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            if (i2 >= 9) {
                try {
                    String str = new String(bArr, i, i2, "UTF-8");
                    String[] strArrSplit = str.split("\r\n", -1);
                    this.messages = new ArrayList();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= strArrSplit.length) {
                            i3 = -1;
                            break;
                        } else {
                            if (strArrSplit[i3].startsWith("SSH-")) {
                                break;
                            }
                            this.messages.add(strArrSplit[i3]);
                            i3++;
                        }
                    }
                    if (i3 != -1) {
                        if (strArrSplit.length >= i3 + 2) {
                            String strSubstring = strArrSplit[i3].substring(4);
                            int iIndexOf = strSubstring.indexOf("-");
                            if (iIndexOf != -1) {
                                this.protoVersion = strSubstring.substring(0, iIndexOf);
                                String strSubstring2 = strSubstring.substring(iIndexOf + 1);
                                int iIndexOf2 = strSubstring2.indexOf(" ");
                                if (iIndexOf2 != -1) {
                                    this.softwareVersion = strSubstring2.substring(0, iIndexOf2);
                                    this.comments = strSubstring2.substring(iIndexOf2 + 1, strSubstring2.length());
                                } else {
                                    this.softwareVersion = strSubstring2.substring(0, strSubstring2.length());
                                    this.comments = "";
                                }
                                if (length() <= 255) {
                                    return;
                                }
                                StringBuilder sbA = o40.A(120, "The data is too long for an SSH version exchange header. data: ");
                                rm7.u(i, ", offset: ", ", length: ", sbA, bArr);
                                sbA.append(i2);
                                throw new IllegalRawDataException(sbA.toString());
                            }
                            StringBuilder sb = new StringBuilder(120);
                            sb.append("The data must start with SSH-protoversion-softwareversion. data: ");
                            sb.append(strSubstring);
                            throw new IllegalRawDataException(sb.toString());
                        }
                        StringBuilder sb2 = new StringBuilder(120);
                        sb2.append("The version string must be terminated by CR LF. data: ");
                        sb2.append(str);
                        throw new IllegalRawDataException(sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder(120);
                    sb3.append("The data doesn't include the version string. data: ");
                    sb3.append(str);
                    throw new IllegalRawDataException(sb3.toString());
                } catch (UnsupportedEncodingException unused) {
                    throw new AssertionError("Never get here.");
                }
            }
            StringBuilder sbA2 = o40.A(120, "The data is too short to build an SSH2 version exchange header. data: ");
            rm7.u(i, ", offset: ", ", length: ", sbA2, bArr);
            sbA2.append(i2);
            throw new IllegalRawDataException(sbA2.toString());
        }

        private Ssh2VersionExchangeHeader(Builder builder) {
            if (builder.messages != null) {
                this.messages = new ArrayList(builder.messages);
            } else {
                this.messages = new ArrayList();
            }
            this.protoVersion = builder.protoVersion;
            this.softwareVersion = builder.softwareVersion;
            this.comments = builder.comments;
            if (length() > 255) {
                StringBuilder sbA = o40.A(120, "The data is too long for an SSH version exchange header. data: builder.messages: [");
                Iterator<String> it = this.messages.iterator();
                while (it.hasNext()) {
                    sbA.append(it.next());
                    if (it.hasNext()) {
                        sbA.append(", ");
                    }
                }
                sbA.append("] builder.protoVersion: ");
                sbA.append(builder.protoVersion);
                sbA.append(" builder.softwareVersion: ");
                sbA.append(builder.softwareVersion);
                sbA.append(" builder.comments: ");
                sbA.append(builder.comments);
                throw new IllegalArgumentException(sbA.toString());
            }
        }
    }

    private Ssh2VersionExchangePacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        this.header = new Ssh2VersionExchangeHeader(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Ssh2VersionExchangeHeader getHeader() {
        return this.header;
    }

    private Ssh2VersionExchangePacket(Builder builder) {
        if (builder != null && builder.protoVersion != null && builder.softwareVersion != null && builder.comments != null) {
            this.header = new Ssh2VersionExchangeHeader(builder);
            return;
        }
        throw new NullPointerException("builder: " + builder + " builder.protoVersion: " + builder.protoVersion + " builder.softwareVersion: " + builder.softwareVersion + " builder.comments: " + builder.comments);
    }
}
