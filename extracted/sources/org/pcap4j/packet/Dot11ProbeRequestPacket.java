package org.pcap4j.packet;

import defpackage.t61;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.pcap4j.packet.Dot11ManagementPacket;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;
import org.pcap4j.util.MacAddress;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11ProbeRequestPacket extends Dot11ManagementPacket {
    private static final long serialVersionUID = -2305355759191727871L;
    private final Dot11ProbeRequestHeader header;

    public static final class Builder extends Dot11ManagementPacket.Builder {
        private Dot11ChannelUsageElement channelUsage;
        private Dot11DsssParameterSetElement dsssParameterSet;
        private Dot11ExtendedCapabilitiesElement extendedCapabilities;
        private Dot11ExtendedSupportedRatesElement extendedSupportedRates;
        private Dot11HTCapabilitiesElement htCapabilities;
        private Dot11InterworkingElement interworking;
        private Dot11MeshIdElement meshId;
        private Dot11RequestElement request;
        private Dot11SsidElement ssid;
        private Dot11SsidListElement ssidList;
        private Dot11SupportedOperatingClassesElement supportedOperatingClasses;
        private Dot11SupportedRatesElement supportedRates;
        private Dot112040BssCoexistenceElement twentyFortyBssCoexistence;
        private List<Dot11VendorSpecificElement> vendorSpecificElements;

        public Builder channelUsage(Dot11ChannelUsageElement dot11ChannelUsageElement) {
            this.channelUsage = dot11ChannelUsageElement;
            return this;
        }

        public Builder dsssParameterSet(Dot11DsssParameterSetElement dot11DsssParameterSetElement) {
            this.dsssParameterSet = dot11DsssParameterSetElement;
            return this;
        }

        public Builder extendedCapabilities(Dot11ExtendedCapabilitiesElement dot11ExtendedCapabilitiesElement) {
            this.extendedCapabilities = dot11ExtendedCapabilitiesElement;
            return this;
        }

        public Builder extendedSupportedRates(Dot11ExtendedSupportedRatesElement dot11ExtendedSupportedRatesElement) {
            this.extendedSupportedRates = dot11ExtendedSupportedRatesElement;
            return this;
        }

        public Builder htCapabilities(Dot11HTCapabilitiesElement dot11HTCapabilitiesElement) {
            this.htCapabilities = dot11HTCapabilitiesElement;
            return this;
        }

        public Builder interworking(Dot11InterworkingElement dot11InterworkingElement) {
            this.interworking = dot11InterworkingElement;
            return this;
        }

        public Builder meshId(Dot11MeshIdElement dot11MeshIdElement) {
            this.meshId = dot11MeshIdElement;
            return this;
        }

        public Builder request(Dot11RequestElement dot11RequestElement) {
            this.request = dot11RequestElement;
            return this;
        }

        public Builder ssid(Dot11SsidElement dot11SsidElement) {
            this.ssid = dot11SsidElement;
            return this;
        }

        public Builder ssidList(Dot11SsidListElement dot11SsidListElement) {
            this.ssidList = dot11SsidListElement;
            return this;
        }

        public Builder supportedOperatingClasses(Dot11SupportedOperatingClassesElement dot11SupportedOperatingClassesElement) {
            this.supportedOperatingClasses = dot11SupportedOperatingClassesElement;
            return this;
        }

        public Builder supportedRates(Dot11SupportedRatesElement dot11SupportedRatesElement) {
            this.supportedRates = dot11SupportedRatesElement;
            return this;
        }

        public Builder twentyFortyBssCoexistence(Dot112040BssCoexistenceElement dot112040BssCoexistenceElement) {
            this.twentyFortyBssCoexistence = dot112040BssCoexistenceElement;
            return this;
        }

        public Builder vendorSpecificElements(List<Dot11VendorSpecificElement> list) {
            this.vendorSpecificElements = list;
            return this;
        }

        public Builder() {
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder
        public Builder address1(MacAddress macAddress) {
            super.address1(macAddress);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder
        public Builder address2(MacAddress macAddress) {
            super.address2(macAddress);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder
        public Builder address3(MacAddress macAddress) {
            super.address3(macAddress);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder
        public Builder duration(short s) {
            super.duration(s);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder
        public Builder fcs(Integer num) {
            super.fcs(num);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder
        public Builder frameControl(Dot11FrameControl dot11FrameControl) {
            super.frameControl(dot11FrameControl);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder
        public Builder htControl(Dot11HtControl dot11HtControl) {
            super.htControl(dot11HtControl);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder
        public Builder sequenceControl(Dot11SequenceControl dot11SequenceControl) {
            super.sequenceControl(dot11SequenceControl);
            return this;
        }

        private Builder(Dot11ProbeRequestPacket dot11ProbeRequestPacket) {
            super(dot11ProbeRequestPacket);
            this.ssid = dot11ProbeRequestPacket.header.ssid;
            this.supportedRates = dot11ProbeRequestPacket.header.supportedRates;
            this.request = dot11ProbeRequestPacket.header.request;
            this.extendedSupportedRates = dot11ProbeRequestPacket.header.extendedSupportedRates;
            this.dsssParameterSet = dot11ProbeRequestPacket.header.dsssParameterSet;
            this.supportedOperatingClasses = dot11ProbeRequestPacket.header.supportedOperatingClasses;
            this.htCapabilities = dot11ProbeRequestPacket.header.htCapabilities;
            this.twentyFortyBssCoexistence = dot11ProbeRequestPacket.header.twentyFortyBssCoexistence;
            this.extendedCapabilities = dot11ProbeRequestPacket.header.extendedCapabilities;
            this.ssidList = dot11ProbeRequestPacket.header.ssidList;
            this.channelUsage = dot11ProbeRequestPacket.header.channelUsage;
            this.interworking = dot11ProbeRequestPacket.header.interworking;
            this.meshId = dot11ProbeRequestPacket.header.meshId;
            this.vendorSpecificElements = dot11ProbeRequestPacket.header.vendorSpecificElements;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder, org.pcap4j.packet.ChecksumBuilder
        public ChecksumBuilder<Dot11ManagementPacket> correctChecksumAtBuild(boolean z) {
            super.correctChecksumAtBuild(z);
            return this;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Builder, org.pcap4j.packet.AbstractPacket.AbstractBuilder, org.pcap4j.packet.Packet.Builder
        public Dot11ManagementPacket build() {
            checkForNull();
            return Dot11ProbeRequestPacket.newPacket(this);
        }
    }

    private Dot11ProbeRequestPacket(byte[] bArr, int i, int i2, Dot11ProbeRequestHeader dot11ProbeRequestHeader) {
        super(bArr, i, i2, dot11ProbeRequestHeader.length());
        this.header = dot11ProbeRequestHeader;
    }

    public static Dot11ProbeRequestPacket newPacket(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Dot11ProbeRequestPacket(bArr, i, i2, new Dot11ProbeRequestHeader(bArr, i, i2));
    }

    public static final class Dot11ProbeRequestHeader extends Dot11ManagementPacket.Dot11ManagementHeader {
        private static final long serialVersionUID = -2203820242563461514L;
        private final Dot11ChannelUsageElement channelUsage;
        private final Dot11DsssParameterSetElement dsssParameterSet;
        private final Dot11ExtendedCapabilitiesElement extendedCapabilities;
        private final Dot11ExtendedSupportedRatesElement extendedSupportedRates;
        private final Dot11HTCapabilitiesElement htCapabilities;
        private final Dot11InterworkingElement interworking;
        private final Dot11MeshIdElement meshId;
        private final Dot11RequestElement request;
        private final Dot11SsidElement ssid;
        private final Dot11SsidListElement ssidList;
        private final Dot11SupportedOperatingClassesElement supportedOperatingClasses;
        private final Dot11SupportedRatesElement supportedRates;
        private final Dot112040BssCoexistenceElement twentyFortyBssCoexistence;
        private final List<Dot11VendorSpecificElement> vendorSpecificElements;

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Dot11ManagementHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public String buildString() {
            StringBuilder sb = new StringBuilder();
            t61.y(sb, super.buildString(), "  Tags:", System.getProperty("line.separator"));
            Dot11SsidElement dot11SsidElement = this.ssid;
            if (dot11SsidElement != null) {
                sb.append(dot11SsidElement.toString("    "));
            }
            Dot11SupportedRatesElement dot11SupportedRatesElement = this.supportedRates;
            if (dot11SupportedRatesElement != null) {
                sb.append(dot11SupportedRatesElement.toString("    "));
            }
            Dot11RequestElement dot11RequestElement = this.request;
            if (dot11RequestElement != null) {
                sb.append(dot11RequestElement.toString("    "));
            }
            Dot11ExtendedSupportedRatesElement dot11ExtendedSupportedRatesElement = this.extendedSupportedRates;
            if (dot11ExtendedSupportedRatesElement != null) {
                sb.append(dot11ExtendedSupportedRatesElement.toString("    "));
            }
            Dot11DsssParameterSetElement dot11DsssParameterSetElement = this.dsssParameterSet;
            if (dot11DsssParameterSetElement != null) {
                sb.append(dot11DsssParameterSetElement.toString("    "));
            }
            Dot11SupportedOperatingClassesElement dot11SupportedOperatingClassesElement = this.supportedOperatingClasses;
            if (dot11SupportedOperatingClassesElement != null) {
                sb.append(dot11SupportedOperatingClassesElement.toString("    "));
            }
            Dot11HTCapabilitiesElement dot11HTCapabilitiesElement = this.htCapabilities;
            if (dot11HTCapabilitiesElement != null) {
                sb.append(dot11HTCapabilitiesElement.toString("    "));
            }
            Dot112040BssCoexistenceElement dot112040BssCoexistenceElement = this.twentyFortyBssCoexistence;
            if (dot112040BssCoexistenceElement != null) {
                sb.append(dot112040BssCoexistenceElement.toString("    "));
            }
            Dot11ExtendedCapabilitiesElement dot11ExtendedCapabilitiesElement = this.extendedCapabilities;
            if (dot11ExtendedCapabilitiesElement != null) {
                sb.append(dot11ExtendedCapabilitiesElement.toString("    "));
            }
            Dot11SsidListElement dot11SsidListElement = this.ssidList;
            if (dot11SsidListElement != null) {
                sb.append(dot11SsidListElement.toString("    "));
            }
            Dot11ChannelUsageElement dot11ChannelUsageElement = this.channelUsage;
            if (dot11ChannelUsageElement != null) {
                sb.append(dot11ChannelUsageElement.toString("    "));
            }
            Dot11InterworkingElement dot11InterworkingElement = this.interworking;
            if (dot11InterworkingElement != null) {
                sb.append(dot11InterworkingElement.toString("    "));
            }
            Dot11MeshIdElement dot11MeshIdElement = this.meshId;
            if (dot11MeshIdElement != null) {
                sb.append(dot11MeshIdElement.toString("    "));
            }
            Iterator<Dot11VendorSpecificElement> it = this.vendorSpecificElements.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString("    "));
            }
            return sb.toString();
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Dot11ManagementHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcHashCode() {
            int iCalcHashCode = super.calcHashCode() * 31;
            Dot11ChannelUsageElement dot11ChannelUsageElement = this.channelUsage;
            int iHashCode = (iCalcHashCode + (dot11ChannelUsageElement == null ? 0 : dot11ChannelUsageElement.hashCode())) * 31;
            Dot11DsssParameterSetElement dot11DsssParameterSetElement = this.dsssParameterSet;
            int iHashCode2 = (iHashCode + (dot11DsssParameterSetElement == null ? 0 : dot11DsssParameterSetElement.hashCode())) * 31;
            Dot11ExtendedCapabilitiesElement dot11ExtendedCapabilitiesElement = this.extendedCapabilities;
            int iHashCode3 = (iHashCode2 + (dot11ExtendedCapabilitiesElement == null ? 0 : dot11ExtendedCapabilitiesElement.hashCode())) * 31;
            Dot11ExtendedSupportedRatesElement dot11ExtendedSupportedRatesElement = this.extendedSupportedRates;
            int iHashCode4 = (iHashCode3 + (dot11ExtendedSupportedRatesElement == null ? 0 : dot11ExtendedSupportedRatesElement.hashCode())) * 31;
            Dot11HTCapabilitiesElement dot11HTCapabilitiesElement = this.htCapabilities;
            int iHashCode5 = (iHashCode4 + (dot11HTCapabilitiesElement == null ? 0 : dot11HTCapabilitiesElement.hashCode())) * 31;
            Dot11InterworkingElement dot11InterworkingElement = this.interworking;
            int iHashCode6 = (iHashCode5 + (dot11InterworkingElement == null ? 0 : dot11InterworkingElement.hashCode())) * 31;
            Dot11MeshIdElement dot11MeshIdElement = this.meshId;
            int iHashCode7 = (iHashCode6 + (dot11MeshIdElement == null ? 0 : dot11MeshIdElement.hashCode())) * 31;
            Dot11RequestElement dot11RequestElement = this.request;
            int iHashCode8 = (iHashCode7 + (dot11RequestElement == null ? 0 : dot11RequestElement.hashCode())) * 31;
            Dot11SsidElement dot11SsidElement = this.ssid;
            int iHashCode9 = (iHashCode8 + (dot11SsidElement == null ? 0 : dot11SsidElement.hashCode())) * 31;
            Dot11SsidListElement dot11SsidListElement = this.ssidList;
            int iHashCode10 = (iHashCode9 + (dot11SsidListElement == null ? 0 : dot11SsidListElement.hashCode())) * 31;
            Dot11SupportedOperatingClassesElement dot11SupportedOperatingClassesElement = this.supportedOperatingClasses;
            int iHashCode11 = (iHashCode10 + (dot11SupportedOperatingClassesElement == null ? 0 : dot11SupportedOperatingClassesElement.hashCode())) * 31;
            Dot11SupportedRatesElement dot11SupportedRatesElement = this.supportedRates;
            int iHashCode12 = (iHashCode11 + (dot11SupportedRatesElement == null ? 0 : dot11SupportedRatesElement.hashCode())) * 31;
            Dot112040BssCoexistenceElement dot112040BssCoexistenceElement = this.twentyFortyBssCoexistence;
            return this.vendorSpecificElements.hashCode() + ((iHashCode12 + (dot112040BssCoexistenceElement != null ? dot112040BssCoexistenceElement.hashCode() : 0)) * 31);
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Dot11ManagementHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public int calcLength() {
            int iCalcLength = super.calcLength();
            Dot11SsidElement dot11SsidElement = this.ssid;
            if (dot11SsidElement != null) {
                iCalcLength += dot11SsidElement.length();
            }
            Dot11SupportedRatesElement dot11SupportedRatesElement = this.supportedRates;
            if (dot11SupportedRatesElement != null) {
                iCalcLength += dot11SupportedRatesElement.length();
            }
            Dot11RequestElement dot11RequestElement = this.request;
            if (dot11RequestElement != null) {
                iCalcLength += dot11RequestElement.length();
            }
            Dot11ExtendedSupportedRatesElement dot11ExtendedSupportedRatesElement = this.extendedSupportedRates;
            if (dot11ExtendedSupportedRatesElement != null) {
                iCalcLength += dot11ExtendedSupportedRatesElement.length();
            }
            Dot11DsssParameterSetElement dot11DsssParameterSetElement = this.dsssParameterSet;
            if (dot11DsssParameterSetElement != null) {
                iCalcLength += dot11DsssParameterSetElement.length();
            }
            Dot11SupportedOperatingClassesElement dot11SupportedOperatingClassesElement = this.supportedOperatingClasses;
            if (dot11SupportedOperatingClassesElement != null) {
                iCalcLength += dot11SupportedOperatingClassesElement.length();
            }
            Dot11HTCapabilitiesElement dot11HTCapabilitiesElement = this.htCapabilities;
            if (dot11HTCapabilitiesElement != null) {
                iCalcLength += dot11HTCapabilitiesElement.length();
            }
            Dot112040BssCoexistenceElement dot112040BssCoexistenceElement = this.twentyFortyBssCoexistence;
            if (dot112040BssCoexistenceElement != null) {
                iCalcLength += dot112040BssCoexistenceElement.length();
            }
            Dot11ExtendedCapabilitiesElement dot11ExtendedCapabilitiesElement = this.extendedCapabilities;
            if (dot11ExtendedCapabilitiesElement != null) {
                iCalcLength += dot11ExtendedCapabilitiesElement.length();
            }
            Dot11SsidListElement dot11SsidListElement = this.ssidList;
            if (dot11SsidListElement != null) {
                iCalcLength += dot11SsidListElement.length();
            }
            Dot11ChannelUsageElement dot11ChannelUsageElement = this.channelUsage;
            if (dot11ChannelUsageElement != null) {
                iCalcLength += dot11ChannelUsageElement.length();
            }
            Dot11InterworkingElement dot11InterworkingElement = this.interworking;
            if (dot11InterworkingElement != null) {
                iCalcLength += dot11InterworkingElement.length();
            }
            Dot11MeshIdElement dot11MeshIdElement = this.meshId;
            if (dot11MeshIdElement != null) {
                iCalcLength += dot11MeshIdElement.length();
            }
            Iterator<Dot11VendorSpecificElement> it = this.vendorSpecificElements.iterator();
            while (it.hasNext()) {
                iCalcLength += it.next().length();
            }
            return iCalcLength;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Dot11ManagementHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            Dot11ProbeRequestHeader dot11ProbeRequestHeader = (Dot11ProbeRequestHeader) obj;
            Dot11ChannelUsageElement dot11ChannelUsageElement = this.channelUsage;
            if (dot11ChannelUsageElement == null) {
                if (dot11ProbeRequestHeader.channelUsage != null) {
                    return false;
                }
            } else if (!dot11ChannelUsageElement.equals(dot11ProbeRequestHeader.channelUsage)) {
                return false;
            }
            Dot11DsssParameterSetElement dot11DsssParameterSetElement = this.dsssParameterSet;
            if (dot11DsssParameterSetElement == null) {
                if (dot11ProbeRequestHeader.dsssParameterSet != null) {
                    return false;
                }
            } else if (!dot11DsssParameterSetElement.equals(dot11ProbeRequestHeader.dsssParameterSet)) {
                return false;
            }
            Dot11ExtendedCapabilitiesElement dot11ExtendedCapabilitiesElement = this.extendedCapabilities;
            if (dot11ExtendedCapabilitiesElement == null) {
                if (dot11ProbeRequestHeader.extendedCapabilities != null) {
                    return false;
                }
            } else if (!dot11ExtendedCapabilitiesElement.equals(dot11ProbeRequestHeader.extendedCapabilities)) {
                return false;
            }
            Dot11ExtendedSupportedRatesElement dot11ExtendedSupportedRatesElement = this.extendedSupportedRates;
            if (dot11ExtendedSupportedRatesElement == null) {
                if (dot11ProbeRequestHeader.extendedSupportedRates != null) {
                    return false;
                }
            } else if (!dot11ExtendedSupportedRatesElement.equals(dot11ProbeRequestHeader.extendedSupportedRates)) {
                return false;
            }
            Dot11HTCapabilitiesElement dot11HTCapabilitiesElement = this.htCapabilities;
            if (dot11HTCapabilitiesElement == null) {
                if (dot11ProbeRequestHeader.htCapabilities != null) {
                    return false;
                }
            } else if (!dot11HTCapabilitiesElement.equals(dot11ProbeRequestHeader.htCapabilities)) {
                return false;
            }
            Dot11InterworkingElement dot11InterworkingElement = this.interworking;
            if (dot11InterworkingElement == null) {
                if (dot11ProbeRequestHeader.interworking != null) {
                    return false;
                }
            } else if (!dot11InterworkingElement.equals(dot11ProbeRequestHeader.interworking)) {
                return false;
            }
            Dot11MeshIdElement dot11MeshIdElement = this.meshId;
            if (dot11MeshIdElement == null) {
                if (dot11ProbeRequestHeader.meshId != null) {
                    return false;
                }
            } else if (!dot11MeshIdElement.equals(dot11ProbeRequestHeader.meshId)) {
                return false;
            }
            Dot11RequestElement dot11RequestElement = this.request;
            if (dot11RequestElement == null) {
                if (dot11ProbeRequestHeader.request != null) {
                    return false;
                }
            } else if (!dot11RequestElement.equals(dot11ProbeRequestHeader.request)) {
                return false;
            }
            Dot11SsidElement dot11SsidElement = this.ssid;
            if (dot11SsidElement == null) {
                if (dot11ProbeRequestHeader.ssid != null) {
                    return false;
                }
            } else if (!dot11SsidElement.equals(dot11ProbeRequestHeader.ssid)) {
                return false;
            }
            Dot11SsidListElement dot11SsidListElement = this.ssidList;
            if (dot11SsidListElement == null) {
                if (dot11ProbeRequestHeader.ssidList != null) {
                    return false;
                }
            } else if (!dot11SsidListElement.equals(dot11ProbeRequestHeader.ssidList)) {
                return false;
            }
            Dot11SupportedOperatingClassesElement dot11SupportedOperatingClassesElement = this.supportedOperatingClasses;
            if (dot11SupportedOperatingClassesElement == null) {
                if (dot11ProbeRequestHeader.supportedOperatingClasses != null) {
                    return false;
                }
            } else if (!dot11SupportedOperatingClassesElement.equals(dot11ProbeRequestHeader.supportedOperatingClasses)) {
                return false;
            }
            Dot11SupportedRatesElement dot11SupportedRatesElement = this.supportedRates;
            if (dot11SupportedRatesElement == null) {
                if (dot11ProbeRequestHeader.supportedRates != null) {
                    return false;
                }
            } else if (!dot11SupportedRatesElement.equals(dot11ProbeRequestHeader.supportedRates)) {
                return false;
            }
            Dot112040BssCoexistenceElement dot112040BssCoexistenceElement = this.twentyFortyBssCoexistence;
            if (dot112040BssCoexistenceElement == null) {
                if (dot11ProbeRequestHeader.twentyFortyBssCoexistence != null) {
                    return false;
                }
            } else if (!dot112040BssCoexistenceElement.equals(dot11ProbeRequestHeader.twentyFortyBssCoexistence)) {
                return false;
            }
            return this.vendorSpecificElements.equals(dot11ProbeRequestHeader.vendorSpecificElements);
        }

        public Dot112040BssCoexistenceElement get2040BssCoexistence() {
            return this.twentyFortyBssCoexistence;
        }

        public Dot11ChannelUsageElement getChannelUsage() {
            return this.channelUsage;
        }

        public Dot11DsssParameterSetElement getDsssParameterSet() {
            return this.dsssParameterSet;
        }

        public Dot11ExtendedCapabilitiesElement getExtendedCapabilities() {
            return this.extendedCapabilities;
        }

        public Dot11ExtendedSupportedRatesElement getExtendedSupportedRates() {
            return this.extendedSupportedRates;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Dot11ManagementHeader
        public String getHeaderName() {
            return "IEEE802.11 Probe Request header";
        }

        public Dot11HTCapabilitiesElement getHtCapabilities() {
            return this.htCapabilities;
        }

        public Dot11InterworkingElement getInterworking() {
            return this.interworking;
        }

        public Dot11MeshIdElement getMeshId() {
            return this.meshId;
        }

        @Override // org.pcap4j.packet.Dot11ManagementPacket.Dot11ManagementHeader, org.pcap4j.packet.AbstractPacket.AbstractHeader
        public List<byte[]> getRawFields() {
            List<byte[]> rawFields = super.getRawFields();
            Dot11SsidElement dot11SsidElement = this.ssid;
            if (dot11SsidElement != null) {
                rawFields.add(dot11SsidElement.getRawData());
            }
            Dot11SupportedRatesElement dot11SupportedRatesElement = this.supportedRates;
            if (dot11SupportedRatesElement != null) {
                rawFields.add(dot11SupportedRatesElement.getRawData());
            }
            Dot11RequestElement dot11RequestElement = this.request;
            if (dot11RequestElement != null) {
                rawFields.add(dot11RequestElement.getRawData());
            }
            Dot11ExtendedSupportedRatesElement dot11ExtendedSupportedRatesElement = this.extendedSupportedRates;
            if (dot11ExtendedSupportedRatesElement != null) {
                rawFields.add(dot11ExtendedSupportedRatesElement.getRawData());
            }
            Dot11DsssParameterSetElement dot11DsssParameterSetElement = this.dsssParameterSet;
            if (dot11DsssParameterSetElement != null) {
                rawFields.add(dot11DsssParameterSetElement.getRawData());
            }
            Dot11SupportedOperatingClassesElement dot11SupportedOperatingClassesElement = this.supportedOperatingClasses;
            if (dot11SupportedOperatingClassesElement != null) {
                rawFields.add(dot11SupportedOperatingClassesElement.getRawData());
            }
            Dot11HTCapabilitiesElement dot11HTCapabilitiesElement = this.htCapabilities;
            if (dot11HTCapabilitiesElement != null) {
                rawFields.add(dot11HTCapabilitiesElement.getRawData());
            }
            Dot112040BssCoexistenceElement dot112040BssCoexistenceElement = this.twentyFortyBssCoexistence;
            if (dot112040BssCoexistenceElement != null) {
                rawFields.add(dot112040BssCoexistenceElement.getRawData());
            }
            Dot11ExtendedCapabilitiesElement dot11ExtendedCapabilitiesElement = this.extendedCapabilities;
            if (dot11ExtendedCapabilitiesElement != null) {
                rawFields.add(dot11ExtendedCapabilitiesElement.getRawData());
            }
            Dot11SsidListElement dot11SsidListElement = this.ssidList;
            if (dot11SsidListElement != null) {
                rawFields.add(dot11SsidListElement.getRawData());
            }
            Dot11ChannelUsageElement dot11ChannelUsageElement = this.channelUsage;
            if (dot11ChannelUsageElement != null) {
                rawFields.add(dot11ChannelUsageElement.getRawData());
            }
            Dot11InterworkingElement dot11InterworkingElement = this.interworking;
            if (dot11InterworkingElement != null) {
                rawFields.add(dot11InterworkingElement.getRawData());
            }
            Dot11MeshIdElement dot11MeshIdElement = this.meshId;
            if (dot11MeshIdElement != null) {
                rawFields.add(dot11MeshIdElement.getRawData());
            }
            Iterator<Dot11VendorSpecificElement> it = this.vendorSpecificElements.iterator();
            while (it.hasNext()) {
                rawFields.add(it.next().getRawData());
            }
            return rawFields;
        }

        public Dot11RequestElement getRequest() {
            return this.request;
        }

        public Dot11SsidElement getSsid() {
            return this.ssid;
        }

        public Dot11SsidListElement getSsidList() {
            return this.ssidList;
        }

        public Dot11SupportedOperatingClassesElement getSupportedOperatingClasses() {
            return this.supportedOperatingClasses;
        }

        public Dot11SupportedRatesElement getSupportedRates() {
            return this.supportedRates;
        }

        public List<Dot11VendorSpecificElement> getVendorSpecificElements() {
            return new ArrayList(this.vendorSpecificElements);
        }

        private Dot11ProbeRequestHeader(byte[] bArr, int i, int i2) throws IllegalRawDataException {
            super(bArr, i, i2);
            int iCalcLength = super.calcLength();
            int i3 = i + iCalcLength;
            int i4 = i2 - iCalcLength;
            if (i4 > 0 && bArr[i3] == Dot11InformationElementId.SSID.value().byteValue()) {
                Dot11SsidElement dot11SsidElementNewInstance = Dot11SsidElement.newInstance(bArr, i3, i4);
                this.ssid = dot11SsidElementNewInstance;
                int length = dot11SsidElementNewInstance.length();
                i3 += length;
                i4 -= length;
            } else {
                this.ssid = null;
            }
            if (i4 > 0 && bArr[i3] == Dot11InformationElementId.SUPPORTED_RATES.value().byteValue()) {
                Dot11SupportedRatesElement dot11SupportedRatesElementNewInstance = Dot11SupportedRatesElement.newInstance(bArr, i3, i4);
                this.supportedRates = dot11SupportedRatesElementNewInstance;
                int length2 = dot11SupportedRatesElementNewInstance.length();
                i3 += length2;
                i4 -= length2;
            } else {
                this.supportedRates = null;
            }
            if (i4 > 0 && bArr[i3] == Dot11InformationElementId.REQUEST.value().byteValue()) {
                Dot11RequestElement dot11RequestElementNewInstance = Dot11RequestElement.newInstance(bArr, i3, i4);
                this.request = dot11RequestElementNewInstance;
                int length3 = dot11RequestElementNewInstance.length();
                i3 += length3;
                i4 -= length3;
            } else {
                this.request = null;
            }
            if (i4 > 0 && bArr[i3] == Dot11InformationElementId.EXTENDED_SUPPORTED_RATES.value().byteValue()) {
                Dot11ExtendedSupportedRatesElement dot11ExtendedSupportedRatesElementNewInstance = Dot11ExtendedSupportedRatesElement.newInstance(bArr, i3, i4);
                this.extendedSupportedRates = dot11ExtendedSupportedRatesElementNewInstance;
                int length4 = dot11ExtendedSupportedRatesElementNewInstance.length();
                i3 += length4;
                i4 -= length4;
            } else {
                this.extendedSupportedRates = null;
            }
            if (i4 > 0 && bArr[i3] == Dot11InformationElementId.DSSS_PARAMETER_SET.value().byteValue()) {
                Dot11DsssParameterSetElement dot11DsssParameterSetElementNewInstance = Dot11DsssParameterSetElement.newInstance(bArr, i3, i4);
                this.dsssParameterSet = dot11DsssParameterSetElementNewInstance;
                int length5 = dot11DsssParameterSetElementNewInstance.length();
                i3 += length5;
                i4 -= length5;
            } else {
                this.dsssParameterSet = null;
            }
            if (i4 > 0 && bArr[i3] == Dot11InformationElementId.SUPPORTED_OPERATING_CLASSES.value().byteValue()) {
                Dot11SupportedOperatingClassesElement dot11SupportedOperatingClassesElementNewInstance = Dot11SupportedOperatingClassesElement.newInstance(bArr, i3, i4);
                this.supportedOperatingClasses = dot11SupportedOperatingClassesElementNewInstance;
                int length6 = dot11SupportedOperatingClassesElementNewInstance.length();
                i3 += length6;
                i4 -= length6;
            } else {
                this.supportedOperatingClasses = null;
            }
            if (i4 > 0 && bArr[i3] == Dot11InformationElementId.HT_CAPABILITIES.value().byteValue()) {
                Dot11HTCapabilitiesElement dot11HTCapabilitiesElementNewInstance = Dot11HTCapabilitiesElement.newInstance(bArr, i3, i4);
                this.htCapabilities = dot11HTCapabilitiesElementNewInstance;
                int length7 = dot11HTCapabilitiesElementNewInstance.length();
                i3 += length7;
                i4 -= length7;
            } else {
                this.htCapabilities = null;
            }
            if (i4 > 0 && bArr[i3] == Dot11InformationElementId.IE_20_40_BSS_COEXISTENCE.value().byteValue()) {
                Dot112040BssCoexistenceElement dot112040BssCoexistenceElementNewInstance = Dot112040BssCoexistenceElement.newInstance(bArr, i3, i4);
                this.twentyFortyBssCoexistence = dot112040BssCoexistenceElementNewInstance;
                int length8 = dot112040BssCoexistenceElementNewInstance.length();
                i3 += length8;
                i4 -= length8;
            } else {
                this.twentyFortyBssCoexistence = null;
            }
            if (i4 > 0 && bArr[i3] == Dot11InformationElementId.EXTENDED_CAPABILITIES.value().byteValue()) {
                Dot11ExtendedCapabilitiesElement dot11ExtendedCapabilitiesElementNewInstance = Dot11ExtendedCapabilitiesElement.newInstance(bArr, i3, i4);
                this.extendedCapabilities = dot11ExtendedCapabilitiesElementNewInstance;
                int length9 = dot11ExtendedCapabilitiesElementNewInstance.length();
                i3 += length9;
                i4 -= length9;
            } else {
                this.extendedCapabilities = null;
            }
            if (i4 > 0 && bArr[i3] == Dot11InformationElementId.SSID_LIST.value().byteValue()) {
                Dot11SsidListElement dot11SsidListElementNewInstance = Dot11SsidListElement.newInstance(bArr, i3, i4);
                this.ssidList = dot11SsidListElementNewInstance;
                int length10 = dot11SsidListElementNewInstance.length();
                i3 += length10;
                i4 -= length10;
            } else {
                this.ssidList = null;
            }
            if (i4 > 0 && bArr[i3] == Dot11InformationElementId.CHANNEL_USAGE.value().byteValue()) {
                Dot11ChannelUsageElement dot11ChannelUsageElementNewInstance = Dot11ChannelUsageElement.newInstance(bArr, i3, i4);
                this.channelUsage = dot11ChannelUsageElementNewInstance;
                int length11 = dot11ChannelUsageElementNewInstance.length();
                i3 += length11;
                i4 -= length11;
            } else {
                this.channelUsage = null;
            }
            if (i4 > 0 && bArr[i3] == Dot11InformationElementId.INTERWORKING.value().byteValue()) {
                Dot11InterworkingElement dot11InterworkingElementNewInstance = Dot11InterworkingElement.newInstance(bArr, i3, i4);
                this.interworking = dot11InterworkingElementNewInstance;
                int length12 = dot11InterworkingElementNewInstance.length();
                i3 += length12;
                i4 -= length12;
            } else {
                this.interworking = null;
            }
            if (i4 > 0 && bArr[i3] == Dot11InformationElementId.MESH_ID.value().byteValue()) {
                Dot11MeshIdElement dot11MeshIdElementNewInstance = Dot11MeshIdElement.newInstance(bArr, i3, i4);
                this.meshId = dot11MeshIdElementNewInstance;
                int length13 = dot11MeshIdElementNewInstance.length();
                i3 += length13;
                i4 -= length13;
            } else {
                this.meshId = null;
            }
            this.vendorSpecificElements = new ArrayList();
            while (i4 > 0 && bArr[i3] == Dot11InformationElementId.VENDOR_SPECIFIC.value().byteValue()) {
                Dot11VendorSpecificElement dot11VendorSpecificElementNewInstance = Dot11VendorSpecificElement.newInstance(bArr, i3, i4);
                this.vendorSpecificElements.add(dot11VendorSpecificElementNewInstance);
                int length14 = dot11VendorSpecificElementNewInstance.length();
                i3 += length14;
                i4 -= length14;
            }
        }

        private Dot11ProbeRequestHeader(Builder builder) {
            super(builder);
            this.ssid = builder.ssid;
            this.supportedRates = builder.supportedRates;
            this.request = builder.request;
            this.extendedSupportedRates = builder.extendedSupportedRates;
            this.dsssParameterSet = builder.dsssParameterSet;
            this.supportedOperatingClasses = builder.supportedOperatingClasses;
            this.htCapabilities = builder.htCapabilities;
            this.twentyFortyBssCoexistence = builder.twentyFortyBssCoexistence;
            this.extendedCapabilities = builder.extendedCapabilities;
            this.ssidList = builder.ssidList;
            this.channelUsage = builder.channelUsage;
            this.interworking = builder.interworking;
            this.meshId = builder.meshId;
            if (builder.vendorSpecificElements == null) {
                this.vendorSpecificElements = Collections.EMPTY_LIST;
            } else {
                this.vendorSpecificElements = new ArrayList(builder.vendorSpecificElements);
            }
        }
    }

    private Dot11ProbeRequestPacket(Builder builder, Dot11ProbeRequestHeader dot11ProbeRequestHeader) {
        super(builder, dot11ProbeRequestHeader);
        this.header = dot11ProbeRequestHeader;
    }

    @Override // org.pcap4j.packet.Dot11ManagementPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Builder getBuilder() {
        return new Builder();
    }

    @Override // org.pcap4j.packet.Dot11ManagementPacket, org.pcap4j.packet.AbstractPacket, org.pcap4j.packet.Packet
    public Dot11ProbeRequestHeader getHeader() {
        return this.header;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Dot11ProbeRequestPacket newPacket(Builder builder) {
        return new Dot11ProbeRequestPacket(builder, new Dot11ProbeRequestHeader(builder));
    }
}
