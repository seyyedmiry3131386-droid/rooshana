package org.pcap4j.packet;

import defpackage.dw1;
import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import java.nio.ByteOrder;
import java.util.Arrays;
import org.pcap4j.packet.Dot11InformationElement;
import org.pcap4j.packet.namednumber.Dot11InformationElementId;
import org.pcap4j.util.ByteArrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Dot11HTCapabilitiesElement extends Dot11InformationElement {
    private static final long serialVersionUID = -5174208022820530840L;
    private final boolean antennaIndicesFeedbackBasedTxAselSupported;
    private final boolean antennaIndicesFeedbackSupported;
    private final boolean antennaSelectionSupported;
    private final boolean bit101OfSupportedMcsSet;
    private final boolean bit102OfSupportedMcsSet;
    private final boolean bit103OfSupportedMcsSet;
    private final boolean bit104OfSupportedMcsSet;
    private final boolean bit105OfSupportedMcsSet;
    private final boolean bit106OfSupportedMcsSet;
    private final boolean bit107OfSupportedMcsSet;
    private final boolean bit108OfSupportedMcsSet;
    private final boolean bit109OfSupportedMcsSet;
    private final boolean bit110OfSupportedMcsSet;
    private final boolean bit111OfSupportedMcsSet;
    private final boolean bit112OfSupportedMcsSet;
    private final boolean bit113OfSupportedMcsSet;
    private final boolean bit114OfSupportedMcsSet;
    private final boolean bit115OfSupportedMcsSet;
    private final boolean bit116OfSupportedMcsSet;
    private final boolean bit117OfSupportedMcsSet;
    private final boolean bit118OfSupportedMcsSet;
    private final boolean bit119OfSupportedMcsSet;
    private final boolean bit120OfSupportedMcsSet;
    private final boolean bit121OfSupportedMcsSet;
    private final boolean bit122OfSupportedMcsSet;
    private final boolean bit123OfSupportedMcsSet;
    private final boolean bit124OfSupportedMcsSet;
    private final boolean bit125OfSupportedMcsSet;
    private final boolean bit126OfSupportedMcsSet;
    private final boolean bit127OfSupportedMcsSet;
    private final boolean bit12OfHtExtendedCapabilities;
    private final boolean bit13OfHtCapabilitiesInfo;
    private final boolean bit13OfHtExtendedCapabilities;
    private final boolean bit14OfHtExtendedCapabilities;
    private final boolean bit15OfHtExtendedCapabilities;
    private final boolean bit29OfTransmitBeamformingCapabilities;
    private final boolean bit30OfTransmitBeamformingCapabilities;
    private final boolean bit31OfTransmitBeamformingCapabilities;
    private final boolean bit3OfHtExtendedCapabilities;
    private final boolean bit4OfHtExtendedCapabilities;
    private final boolean bit5OfAMpduParameters;
    private final boolean bit5OfHtExtendedCapabilities;
    private final boolean bit6OfAMpduParameters;
    private final boolean bit6OfHtExtendedCapabilities;
    private final boolean bit77OfSupportedMcsSet;
    private final boolean bit78OfSupportedMcsSet;
    private final boolean bit79OfSupportedMcsSet;
    private final boolean bit7OfAMpduParameters;
    private final boolean bit7OfAselCapability;
    private final boolean bit7OfHtExtendedCapabilities;
    private final boolean bit90OfSupportedMcsSet;
    private final boolean bit91OfSupportedMcsSet;
    private final boolean bit92OfSupportedMcsSet;
    private final boolean bit93OfSupportedMcsSet;
    private final boolean bit94OfSupportedMcsSet;
    private final boolean bit95OfSupportedMcsSet;
    private final boolean both20and40MhzSupported;
    private final Calibration calibration;
    private final ChannelEstimationCapability channelEstimationCapability;
    private final NumBeamformerAntennas compressedSteeringNumBeamformerAntennasSupported;
    private final CsiNumRows csiMaxNumRowsBeamformerSupported;
    private final NumBeamformerAntennas csiNumBeamformerAntennasSupported;
    private final boolean dsssCckModeIn40MhzSupported;
    private final BeamformingFeedbackCapability explicitCompressedBeamformingFeedbackCapability;
    private final boolean explicitCompressedSteeringSupported;
    private final boolean explicitCsiFeedbackBasedTxAselSupported;
    private final boolean explicitCsiFeedbackSupported;
    private final boolean explicitCsiTxBeamformingSupported;
    private final BeamformingFeedbackCapability explicitNoncompressedBeamformingFeedbackCapability;
    private final boolean explicitNoncompressedSteeringSupported;
    private final BeamformingFeedbackCapability explicitTxBeamformingCsiFeedbackCapability;
    private final boolean fortyMhzIntolerant;
    private final boolean htControlFieldSupported;
    private final boolean htDelayedBlockAckSupported;
    private final boolean htGreenfieldSupported;
    private final boolean implicitTxBeamformingReceivingSupported;
    private final boolean implicitTxBeamformingSupported;
    private final boolean lSigTxopProtectionSupported;
    private final boolean ldpcCodingSupported;
    private final AMpduLength maxAMpduLength;
    private final AMsduLength maxAMsduLength;
    private final McsFeedbackCapability mcsFeedbackCapability;
    private final Grouping minGrouping;
    private final MpduStartSpacing minMpduStartSpacing;
    private final NumBeamformerAntennas noncompressedSteeringNumBeamformerAntennasSupported;
    private final boolean pcoSupported;
    private final PcoTransitionTime pcoTransitionTime;
    private final boolean rdResponderSupported;
    private final boolean rxAselSupported;
    private final short rxHighestSupportedDataRate;
    private final boolean rxNdpSupported;
    private final boolean rxStaggeredSoundingSupported;
    private final StbcSupport rxStbcSupport;
    private final boolean shortGiFor20MhzSupported;
    private final boolean shortGiFor40MhzSupported;
    private final SmPowerSaveMode smPowerSaveMode;
    private final boolean[] supportedRxMcsIndexes;
    private final NumSpatialStreams txMaxNumSpatialStreamsSupported;
    private final boolean txMcsSetDefined;
    private final boolean txNdpSupported;
    private final boolean txRxMcsSetNotEqual;
    private final boolean txSoundingPpdusSupported;
    private final boolean txStaggeredSoundingSupported;
    private final boolean txStbcSupported;
    private final boolean txUnequalModulationSupported;

    public enum AMpduLength {
        MAX_8191(0, "8191 octets"),
        MAX_16383(1, "16383 octets"),
        MAX_32767(2, "32767 octets"),
        MAX_65535(3, "65535 octets");

        private final String name;
        private final int value;

        AMpduLength(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static AMpduLength getInstance(int i) {
            for (AMpduLength aMpduLength : values()) {
                if (aMpduLength.value == i) {
                    return aMpduLength;
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

    public enum AMsduLength {
        MAX_3839(0, "3839 octets"),
        MAX_7935(1, "7935 octets");

        private final String name;
        private final int value;

        AMsduLength(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static AMsduLength getInstance(int i) {
            for (AMsduLength aMsduLength : values()) {
                if (aMsduLength.value == i) {
                    return aMsduLength;
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

    public enum BeamformingFeedbackCapability {
        NOT_SUPPORTED(0, "Not supported"),
        DELAYED(1, "Delayed"),
        IMMEDIATE(2, "Immediate"),
        DELAYED_AND_IMMEDIATE(3, "Delayed and immediate");

        private final String name;
        private final int value;

        BeamformingFeedbackCapability(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static BeamformingFeedbackCapability getInstance(int i) {
            for (BeamformingFeedbackCapability beamformingFeedbackCapability : values()) {
                if (beamformingFeedbackCapability.value == i) {
                    return beamformingFeedbackCapability;
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

    public static final class Builder extends Dot11InformationElement.Builder {
        private boolean antennaIndicesFeedbackBasedTxAselSupported;
        private boolean antennaIndicesFeedbackSupported;
        private boolean antennaSelectionSupported;
        private boolean bit101OfSupportedMcsSet;
        private boolean bit102OfSupportedMcsSet;
        private boolean bit103OfSupportedMcsSet;
        private boolean bit104OfSupportedMcsSet;
        private boolean bit105OfSupportedMcsSet;
        private boolean bit106OfSupportedMcsSet;
        private boolean bit107OfSupportedMcsSet;
        private boolean bit108OfSupportedMcsSet;
        private boolean bit109OfSupportedMcsSet;
        private boolean bit110OfSupportedMcsSet;
        private boolean bit111OfSupportedMcsSet;
        private boolean bit112OfSupportedMcsSet;
        private boolean bit113OfSupportedMcsSet;
        private boolean bit114OfSupportedMcsSet;
        private boolean bit115OfSupportedMcsSet;
        private boolean bit116OfSupportedMcsSet;
        private boolean bit117OfSupportedMcsSet;
        private boolean bit118OfSupportedMcsSet;
        private boolean bit119OfSupportedMcsSet;
        private boolean bit120OfSupportedMcsSet;
        private boolean bit121OfSupportedMcsSet;
        private boolean bit122OfSupportedMcsSet;
        private boolean bit123OfSupportedMcsSet;
        private boolean bit124OfSupportedMcsSet;
        private boolean bit125OfSupportedMcsSet;
        private boolean bit126OfSupportedMcsSet;
        private boolean bit127OfSupportedMcsSet;
        private boolean bit12OfHtExtendedCapabilities;
        private boolean bit13OfHtCapabilitiesInfo;
        private boolean bit13OfHtExtendedCapabilities;
        private boolean bit14OfHtExtendedCapabilities;
        private boolean bit15OfHtExtendedCapabilities;
        private boolean bit29OfTransmitBeamformingCapabilities;
        private boolean bit30OfTransmitBeamformingCapabilities;
        private boolean bit31OfTransmitBeamformingCapabilities;
        private boolean bit3OfHtExtendedCapabilities;
        private boolean bit4OfHtExtendedCapabilities;
        private boolean bit5OfAMpduParameters;
        private boolean bit5OfHtExtendedCapabilities;
        private boolean bit6OfAMpduParameters;
        private boolean bit6OfHtExtendedCapabilities;
        private boolean bit77OfSupportedMcsSet;
        private boolean bit78OfSupportedMcsSet;
        private boolean bit79OfSupportedMcsSet;
        private boolean bit7OfAMpduParameters;
        private boolean bit7OfAselCapability;
        private boolean bit7OfHtExtendedCapabilities;
        private boolean bit90OfSupportedMcsSet;
        private boolean bit91OfSupportedMcsSet;
        private boolean bit92OfSupportedMcsSet;
        private boolean bit93OfSupportedMcsSet;
        private boolean bit94OfSupportedMcsSet;
        private boolean bit95OfSupportedMcsSet;
        private boolean both20and40MhzSupported;
        private Calibration calibration;
        private ChannelEstimationCapability channelEstimationCapability;
        private NumBeamformerAntennas compressedSteeringNumBeamformerAntennasSupported;
        private CsiNumRows csiMaxNumRowsBeamformerSupported;
        private NumBeamformerAntennas csiNumBeamformerAntennasSupported;
        private boolean dsssCckModeIn40MhzSupported;
        private BeamformingFeedbackCapability explicitCompressedBeamformingFeedbackCapability;
        private boolean explicitCompressedSteeringSupported;
        private boolean explicitCsiFeedbackBasedTxAselSupported;
        private boolean explicitCsiFeedbackSupported;
        private boolean explicitCsiTxBeamformingSupported;
        private BeamformingFeedbackCapability explicitNoncompressedBeamformingFeedbackCapability;
        private boolean explicitNoncompressedSteeringSupported;
        private BeamformingFeedbackCapability explicitTxBeamformingCsiFeedbackCapability;
        private boolean fortyMhzIntolerant;
        private boolean htControlFieldSupported;
        private boolean htDelayedBlockAckSupported;
        private boolean htGreenfieldSupported;
        private boolean implicitTxBeamformingReceivingSupported;
        private boolean implicitTxBeamformingSupported;
        private boolean lSigTxopProtectionSupported;
        private boolean ldpcCodingSupported;
        private AMpduLength maxAMpduLength;
        private AMsduLength maxAMsduLength;
        private McsFeedbackCapability mcsFeedbackCapability;
        private Grouping minGrouping;
        private MpduStartSpacing minMpduStartSpacing;
        private NumBeamformerAntennas noncompressedSteeringNumBeamformerAntennasSupported;
        private boolean pcoSupported;
        private PcoTransitionTime pcoTransitionTime;
        private boolean rdResponderSupported;
        private boolean rxAselSupported;
        private short rxHighestSupportedDataRate;
        private boolean rxNdpSupported;
        private boolean rxStaggeredSoundingSupported;
        private StbcSupport rxStbcSupport;
        private boolean shortGiFor20MhzSupported;
        private boolean shortGiFor40MhzSupported;
        private SmPowerSaveMode smPowerSaveMode;
        private boolean[] supportedRxMcsIndexes;
        private NumSpatialStreams txMaxNumSpatialStreamsSupported;
        private boolean txMcsSetDefined;
        private boolean txNdpSupported;
        private boolean txRxMcsSetNotEqual;
        private boolean txSoundingPpdusSupported;
        private boolean txStaggeredSoundingSupported;
        private boolean txStbcSupported;
        private boolean txUnequalModulationSupported;

        public Builder antennaIndicesFeedbackBasedTxAselSupported(boolean z) {
            this.antennaIndicesFeedbackBasedTxAselSupported = z;
            return this;
        }

        public Builder antennaIndicesFeedbackSupported(boolean z) {
            this.antennaIndicesFeedbackSupported = z;
            return this;
        }

        public Builder antennaSelectionSupported(boolean z) {
            this.antennaSelectionSupported = z;
            return this;
        }

        public Builder bit101OfSupportedMcsSet(boolean z) {
            this.bit101OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit102OfSupportedMcsSet(boolean z) {
            this.bit102OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit103OfSupportedMcsSet(boolean z) {
            this.bit103OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit104OfSupportedMcsSet(boolean z) {
            this.bit104OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit105OfSupportedMcsSet(boolean z) {
            this.bit105OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit106OfSupportedMcsSet(boolean z) {
            this.bit106OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit107OfSupportedMcsSet(boolean z) {
            this.bit107OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit108OfSupportedMcsSet(boolean z) {
            this.bit108OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit109OfSupportedMcsSet(boolean z) {
            this.bit109OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit110OfSupportedMcsSet(boolean z) {
            this.bit110OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit111OfSupportedMcsSet(boolean z) {
            this.bit111OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit112OfSupportedMcsSet(boolean z) {
            this.bit112OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit113OfSupportedMcsSet(boolean z) {
            this.bit113OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit114OfSupportedMcsSet(boolean z) {
            this.bit114OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit115OfSupportedMcsSet(boolean z) {
            this.bit115OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit116OfSupportedMcsSet(boolean z) {
            this.bit116OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit117OfSupportedMcsSet(boolean z) {
            this.bit117OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit118OfSupportedMcsSet(boolean z) {
            this.bit118OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit119OfSupportedMcsSet(boolean z) {
            this.bit119OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit120OfSupportedMcsSet(boolean z) {
            this.bit120OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit121OfSupportedMcsSet(boolean z) {
            this.bit121OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit122OfSupportedMcsSet(boolean z) {
            this.bit122OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit123OfSupportedMcsSet(boolean z) {
            this.bit123OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit124OfSupportedMcsSet(boolean z) {
            this.bit124OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit125OfSupportedMcsSet(boolean z) {
            this.bit125OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit126OfSupportedMcsSet(boolean z) {
            this.bit126OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit127OfSupportedMcsSet(boolean z) {
            this.bit127OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit12OfHtExtendedCapabilities(boolean z) {
            this.bit12OfHtExtendedCapabilities = z;
            return this;
        }

        public Builder bit13OfHtCapabilitiesInfo(boolean z) {
            this.bit13OfHtCapabilitiesInfo = z;
            return this;
        }

        public Builder bit13OfHtExtendedCapabilities(boolean z) {
            this.bit13OfHtExtendedCapabilities = z;
            return this;
        }

        public Builder bit14OfHtExtendedCapabilities(boolean z) {
            this.bit14OfHtExtendedCapabilities = z;
            return this;
        }

        public Builder bit15OfHtExtendedCapabilities(boolean z) {
            this.bit15OfHtExtendedCapabilities = z;
            return this;
        }

        public Builder bit29OfTransmitBeamformingCapabilities(boolean z) {
            this.bit29OfTransmitBeamformingCapabilities = z;
            return this;
        }

        public Builder bit30OfTransmitBeamformingCapabilities(boolean z) {
            this.bit30OfTransmitBeamformingCapabilities = z;
            return this;
        }

        public Builder bit31OfTransmitBeamformingCapabilities(boolean z) {
            this.bit31OfTransmitBeamformingCapabilities = z;
            return this;
        }

        public Builder bit3OfHtExtendedCapabilities(boolean z) {
            this.bit3OfHtExtendedCapabilities = z;
            return this;
        }

        public Builder bit4OfHtExtendedCapabilities(boolean z) {
            this.bit4OfHtExtendedCapabilities = z;
            return this;
        }

        public Builder bit5OfAMpduParameters(boolean z) {
            this.bit5OfAMpduParameters = z;
            return this;
        }

        public Builder bit5OfHtExtendedCapabilities(boolean z) {
            this.bit5OfHtExtendedCapabilities = z;
            return this;
        }

        public Builder bit6OfAMpduParameters(boolean z) {
            this.bit6OfAMpduParameters = z;
            return this;
        }

        public Builder bit6OfHtExtendedCapabilities(boolean z) {
            this.bit6OfHtExtendedCapabilities = z;
            return this;
        }

        public Builder bit77OfSupportedMcsSet(boolean z) {
            this.bit77OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit78OfSupportedMcsSet(boolean z) {
            this.bit78OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit79OfSupportedMcsSet(boolean z) {
            this.bit79OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit7OfAMpduParameters(boolean z) {
            this.bit7OfAMpduParameters = z;
            return this;
        }

        public Builder bit7OfAselCapability(boolean z) {
            this.bit7OfAselCapability = z;
            return this;
        }

        public Builder bit7OfHtExtendedCapabilities(boolean z) {
            this.bit7OfHtExtendedCapabilities = z;
            return this;
        }

        public Builder bit90OfSupportedMcsSet(boolean z) {
            this.bit90OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit91OfSupportedMcsSet(boolean z) {
            this.bit91OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit92OfSupportedMcsSet(boolean z) {
            this.bit92OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit93OfSupportedMcsSet(boolean z) {
            this.bit93OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit94OfSupportedMcsSet(boolean z) {
            this.bit94OfSupportedMcsSet = z;
            return this;
        }

        public Builder bit95OfSupportedMcsSet(boolean z) {
            this.bit95OfSupportedMcsSet = z;
            return this;
        }

        public Builder both20and40MhzSupported(boolean z) {
            this.both20and40MhzSupported = z;
            return this;
        }

        public Builder calibration(Calibration calibration) {
            this.calibration = calibration;
            return this;
        }

        public Builder channelEstimationCapability(ChannelEstimationCapability channelEstimationCapability) {
            this.channelEstimationCapability = channelEstimationCapability;
            return this;
        }

        public Builder compressedSteeringNumBeamformerAntennasSupported(NumBeamformerAntennas numBeamformerAntennas) {
            this.compressedSteeringNumBeamformerAntennasSupported = numBeamformerAntennas;
            return this;
        }

        public Builder csiMaxNumRowsBeamformerSupported(CsiNumRows csiNumRows) {
            this.csiMaxNumRowsBeamformerSupported = csiNumRows;
            return this;
        }

        public Builder csiNumBeamformerAntennasSupported(NumBeamformerAntennas numBeamformerAntennas) {
            this.csiNumBeamformerAntennasSupported = numBeamformerAntennas;
            return this;
        }

        public Builder dsssCckModeIn40MhzSupported(boolean z) {
            this.dsssCckModeIn40MhzSupported = z;
            return this;
        }

        public Builder explicitCompressedBeamformingFeedbackCapability(BeamformingFeedbackCapability beamformingFeedbackCapability) {
            this.explicitCompressedBeamformingFeedbackCapability = beamformingFeedbackCapability;
            return this;
        }

        public Builder explicitCompressedSteeringSupported(boolean z) {
            this.explicitCompressedSteeringSupported = z;
            return this;
        }

        public Builder explicitCsiFeedbackBasedTxAselSupported(boolean z) {
            this.explicitCsiFeedbackBasedTxAselSupported = z;
            return this;
        }

        public Builder explicitCsiFeedbackSupported(boolean z) {
            this.explicitCsiFeedbackSupported = z;
            return this;
        }

        public Builder explicitCsiTxBeamformingSupported(boolean z) {
            this.explicitCsiTxBeamformingSupported = z;
            return this;
        }

        public Builder explicitNoncompressedBeamformingFeedbackCapability(BeamformingFeedbackCapability beamformingFeedbackCapability) {
            this.explicitNoncompressedBeamformingFeedbackCapability = beamformingFeedbackCapability;
            return this;
        }

        public Builder explicitNoncompressedSteeringSupported(boolean z) {
            this.explicitNoncompressedSteeringSupported = z;
            return this;
        }

        public Builder explicitTxBeamformingCsiFeedbackCapability(BeamformingFeedbackCapability beamformingFeedbackCapability) {
            this.explicitTxBeamformingCsiFeedbackCapability = beamformingFeedbackCapability;
            return this;
        }

        public Builder fortyMhzIntolerant(boolean z) {
            this.fortyMhzIntolerant = z;
            return this;
        }

        public Builder htControlFieldSupported(boolean z) {
            this.htControlFieldSupported = z;
            return this;
        }

        public Builder htDelayedBlockAckSupported(boolean z) {
            this.htDelayedBlockAckSupported = z;
            return this;
        }

        public Builder htGreenfieldSupported(boolean z) {
            this.htGreenfieldSupported = z;
            return this;
        }

        public Builder implicitTxBeamformingReceivingSupported(boolean z) {
            this.implicitTxBeamformingReceivingSupported = z;
            return this;
        }

        public Builder implicitTxBeamformingSupported(boolean z) {
            this.implicitTxBeamformingSupported = z;
            return this;
        }

        public Builder lSigTxopProtectionSupported(boolean z) {
            this.lSigTxopProtectionSupported = z;
            return this;
        }

        public Builder ldpcCodingSupported(boolean z) {
            this.ldpcCodingSupported = z;
            return this;
        }

        public Builder maxAMpduLength(AMpduLength aMpduLength) {
            this.maxAMpduLength = aMpduLength;
            return this;
        }

        public Builder maxAMsduLength(AMsduLength aMsduLength) {
            this.maxAMsduLength = aMsduLength;
            return this;
        }

        public Builder mcsFeedbackCapability(McsFeedbackCapability mcsFeedbackCapability) {
            this.mcsFeedbackCapability = mcsFeedbackCapability;
            return this;
        }

        public Builder minGrouping(Grouping grouping) {
            this.minGrouping = grouping;
            return this;
        }

        public Builder minMpduStartSpacing(MpduStartSpacing mpduStartSpacing) {
            this.minMpduStartSpacing = mpduStartSpacing;
            return this;
        }

        public Builder noncompressedSteeringNumBeamformerAntennasSupported(NumBeamformerAntennas numBeamformerAntennas) {
            this.noncompressedSteeringNumBeamformerAntennasSupported = numBeamformerAntennas;
            return this;
        }

        public Builder pcoSupported(boolean z) {
            this.pcoSupported = z;
            return this;
        }

        public Builder pcoTransitionTime(PcoTransitionTime pcoTransitionTime) {
            this.pcoTransitionTime = pcoTransitionTime;
            return this;
        }

        public Builder rdResponderSupported(boolean z) {
            this.rdResponderSupported = z;
            return this;
        }

        public Builder rxAselSupported(boolean z) {
            this.rxAselSupported = z;
            return this;
        }

        public Builder rxHighestSupportedDataRate(short s) {
            this.rxHighestSupportedDataRate = s;
            return this;
        }

        public Builder rxNdpSupported(boolean z) {
            this.rxNdpSupported = z;
            return this;
        }

        public Builder rxStaggeredSoundingSupported(boolean z) {
            this.rxStaggeredSoundingSupported = z;
            return this;
        }

        public Builder rxStbcSupport(StbcSupport stbcSupport) {
            this.rxStbcSupport = stbcSupport;
            return this;
        }

        public Builder shortGiFor20MhzSupported(boolean z) {
            this.shortGiFor20MhzSupported = z;
            return this;
        }

        public Builder shortGiFor40MhzSupported(boolean z) {
            this.shortGiFor40MhzSupported = z;
            return this;
        }

        public Builder smPowerSaveMode(SmPowerSaveMode smPowerSaveMode) {
            this.smPowerSaveMode = smPowerSaveMode;
            return this;
        }

        public Builder supportedRxMcsIndexes(boolean[] zArr) {
            this.supportedRxMcsIndexes = zArr;
            return this;
        }

        public Builder txMaxNumSpatialStreamsSupported(NumSpatialStreams numSpatialStreams) {
            this.txMaxNumSpatialStreamsSupported = numSpatialStreams;
            return this;
        }

        public Builder txMcsSetDefined(boolean z) {
            this.txMcsSetDefined = z;
            return this;
        }

        public Builder txNdpSupported(boolean z) {
            this.txNdpSupported = z;
            return this;
        }

        public Builder txRxMcsSetNotEqual(boolean z) {
            this.txRxMcsSetNotEqual = z;
            return this;
        }

        public Builder txSoundingPpdusSupported(boolean z) {
            this.txSoundingPpdusSupported = z;
            return this;
        }

        public Builder txStaggeredSoundingSupported(boolean z) {
            this.txStaggeredSoundingSupported = z;
            return this;
        }

        public Builder txStbcSupported(boolean z) {
            this.txStbcSupported = z;
            return this;
        }

        public Builder txUnequalModulationSupported(boolean z) {
            this.txUnequalModulationSupported = z;
            return this;
        }

        public Builder() {
            elementId(Dot11InformationElementId.getInstance(Dot11InformationElementId.HT_CAPABILITIES.value()));
        }

        @Override // org.pcap4j.packet.LengthBuilder
        public Dot11InformationElement build() {
            if (getCorrectLengthAtBuild()) {
                length((byte) 26);
            }
            return new Dot11HTCapabilitiesElement(this);
        }

        @Override // org.pcap4j.packet.Dot11InformationElement.Builder
        public Builder length(byte b) {
            super.length(b);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.pcap4j.packet.Dot11InformationElement.Builder, org.pcap4j.packet.LengthBuilder
        /* JADX INFO: renamed from: correctLengthAtBuild */
        public LengthBuilder<Dot11InformationElement> correctLengthAtBuild2(boolean z) {
            super.correctLengthAtBuild2(z);
            return this;
        }

        private Builder(Dot11HTCapabilitiesElement dot11HTCapabilitiesElement) {
            super(dot11HTCapabilitiesElement);
            this.ldpcCodingSupported = dot11HTCapabilitiesElement.ldpcCodingSupported;
            this.both20and40MhzSupported = dot11HTCapabilitiesElement.both20and40MhzSupported;
            this.smPowerSaveMode = dot11HTCapabilitiesElement.smPowerSaveMode;
            this.htGreenfieldSupported = dot11HTCapabilitiesElement.htGreenfieldSupported;
            this.shortGiFor20MhzSupported = dot11HTCapabilitiesElement.shortGiFor20MhzSupported;
            this.shortGiFor40MhzSupported = dot11HTCapabilitiesElement.shortGiFor40MhzSupported;
            this.txStbcSupported = dot11HTCapabilitiesElement.txStbcSupported;
            this.rxStbcSupport = dot11HTCapabilitiesElement.rxStbcSupport;
            this.htDelayedBlockAckSupported = dot11HTCapabilitiesElement.htDelayedBlockAckSupported;
            this.maxAMsduLength = dot11HTCapabilitiesElement.maxAMsduLength;
            this.dsssCckModeIn40MhzSupported = dot11HTCapabilitiesElement.dsssCckModeIn40MhzSupported;
            this.bit13OfHtCapabilitiesInfo = dot11HTCapabilitiesElement.bit13OfHtCapabilitiesInfo;
            this.fortyMhzIntolerant = dot11HTCapabilitiesElement.fortyMhzIntolerant;
            this.lSigTxopProtectionSupported = dot11HTCapabilitiesElement.lSigTxopProtectionSupported;
            this.maxAMpduLength = dot11HTCapabilitiesElement.maxAMpduLength;
            this.minMpduStartSpacing = dot11HTCapabilitiesElement.minMpduStartSpacing;
            this.bit5OfAMpduParameters = dot11HTCapabilitiesElement.bit5OfAMpduParameters;
            this.bit6OfAMpduParameters = dot11HTCapabilitiesElement.bit6OfAMpduParameters;
            this.bit7OfAMpduParameters = dot11HTCapabilitiesElement.bit7OfAMpduParameters;
            this.supportedRxMcsIndexes = dot11HTCapabilitiesElement.supportedRxMcsIndexes;
            this.bit77OfSupportedMcsSet = dot11HTCapabilitiesElement.bit77OfSupportedMcsSet;
            this.bit78OfSupportedMcsSet = dot11HTCapabilitiesElement.bit78OfSupportedMcsSet;
            this.bit79OfSupportedMcsSet = dot11HTCapabilitiesElement.bit79OfSupportedMcsSet;
            this.rxHighestSupportedDataRate = dot11HTCapabilitiesElement.rxHighestSupportedDataRate;
            this.bit90OfSupportedMcsSet = dot11HTCapabilitiesElement.bit90OfSupportedMcsSet;
            this.bit91OfSupportedMcsSet = dot11HTCapabilitiesElement.bit91OfSupportedMcsSet;
            this.bit92OfSupportedMcsSet = dot11HTCapabilitiesElement.bit92OfSupportedMcsSet;
            this.bit93OfSupportedMcsSet = dot11HTCapabilitiesElement.bit93OfSupportedMcsSet;
            this.bit94OfSupportedMcsSet = dot11HTCapabilitiesElement.bit94OfSupportedMcsSet;
            this.bit95OfSupportedMcsSet = dot11HTCapabilitiesElement.bit95OfSupportedMcsSet;
            this.txMcsSetDefined = dot11HTCapabilitiesElement.txMcsSetDefined;
            this.txRxMcsSetNotEqual = dot11HTCapabilitiesElement.txRxMcsSetNotEqual;
            this.txMaxNumSpatialStreamsSupported = dot11HTCapabilitiesElement.txMaxNumSpatialStreamsSupported;
            this.txUnequalModulationSupported = dot11HTCapabilitiesElement.txUnequalModulationSupported;
            this.bit101OfSupportedMcsSet = dot11HTCapabilitiesElement.bit101OfSupportedMcsSet;
            this.bit102OfSupportedMcsSet = dot11HTCapabilitiesElement.bit102OfSupportedMcsSet;
            this.bit103OfSupportedMcsSet = dot11HTCapabilitiesElement.bit103OfSupportedMcsSet;
            this.bit104OfSupportedMcsSet = dot11HTCapabilitiesElement.bit104OfSupportedMcsSet;
            this.bit105OfSupportedMcsSet = dot11HTCapabilitiesElement.bit105OfSupportedMcsSet;
            this.bit106OfSupportedMcsSet = dot11HTCapabilitiesElement.bit106OfSupportedMcsSet;
            this.bit107OfSupportedMcsSet = dot11HTCapabilitiesElement.bit107OfSupportedMcsSet;
            this.bit108OfSupportedMcsSet = dot11HTCapabilitiesElement.bit108OfSupportedMcsSet;
            this.bit109OfSupportedMcsSet = dot11HTCapabilitiesElement.bit109OfSupportedMcsSet;
            this.bit110OfSupportedMcsSet = dot11HTCapabilitiesElement.bit110OfSupportedMcsSet;
            this.bit111OfSupportedMcsSet = dot11HTCapabilitiesElement.bit111OfSupportedMcsSet;
            this.bit112OfSupportedMcsSet = dot11HTCapabilitiesElement.bit112OfSupportedMcsSet;
            this.bit113OfSupportedMcsSet = dot11HTCapabilitiesElement.bit113OfSupportedMcsSet;
            this.bit114OfSupportedMcsSet = dot11HTCapabilitiesElement.bit114OfSupportedMcsSet;
            this.bit115OfSupportedMcsSet = dot11HTCapabilitiesElement.bit115OfSupportedMcsSet;
            this.bit116OfSupportedMcsSet = dot11HTCapabilitiesElement.bit116OfSupportedMcsSet;
            this.bit117OfSupportedMcsSet = dot11HTCapabilitiesElement.bit117OfSupportedMcsSet;
            this.bit118OfSupportedMcsSet = dot11HTCapabilitiesElement.bit118OfSupportedMcsSet;
            this.bit119OfSupportedMcsSet = dot11HTCapabilitiesElement.bit119OfSupportedMcsSet;
            this.bit120OfSupportedMcsSet = dot11HTCapabilitiesElement.bit120OfSupportedMcsSet;
            this.bit121OfSupportedMcsSet = dot11HTCapabilitiesElement.bit121OfSupportedMcsSet;
            this.bit122OfSupportedMcsSet = dot11HTCapabilitiesElement.bit122OfSupportedMcsSet;
            this.bit123OfSupportedMcsSet = dot11HTCapabilitiesElement.bit123OfSupportedMcsSet;
            this.bit124OfSupportedMcsSet = dot11HTCapabilitiesElement.bit124OfSupportedMcsSet;
            this.bit125OfSupportedMcsSet = dot11HTCapabilitiesElement.bit125OfSupportedMcsSet;
            this.bit126OfSupportedMcsSet = dot11HTCapabilitiesElement.bit126OfSupportedMcsSet;
            this.bit127OfSupportedMcsSet = dot11HTCapabilitiesElement.bit127OfSupportedMcsSet;
            this.pcoSupported = dot11HTCapabilitiesElement.pcoSupported;
            this.pcoTransitionTime = dot11HTCapabilitiesElement.pcoTransitionTime;
            this.bit3OfHtExtendedCapabilities = dot11HTCapabilitiesElement.bit3OfHtExtendedCapabilities;
            this.bit4OfHtExtendedCapabilities = dot11HTCapabilitiesElement.bit4OfHtExtendedCapabilities;
            this.bit5OfHtExtendedCapabilities = dot11HTCapabilitiesElement.bit5OfHtExtendedCapabilities;
            this.bit6OfHtExtendedCapabilities = dot11HTCapabilitiesElement.bit6OfHtExtendedCapabilities;
            this.bit7OfHtExtendedCapabilities = dot11HTCapabilitiesElement.bit7OfHtExtendedCapabilities;
            this.mcsFeedbackCapability = dot11HTCapabilitiesElement.mcsFeedbackCapability;
            this.htControlFieldSupported = dot11HTCapabilitiesElement.htControlFieldSupported;
            this.rdResponderSupported = dot11HTCapabilitiesElement.rdResponderSupported;
            this.bit12OfHtExtendedCapabilities = dot11HTCapabilitiesElement.bit12OfHtExtendedCapabilities;
            this.bit13OfHtExtendedCapabilities = dot11HTCapabilitiesElement.bit13OfHtExtendedCapabilities;
            this.bit14OfHtExtendedCapabilities = dot11HTCapabilitiesElement.bit14OfHtExtendedCapabilities;
            this.bit15OfHtExtendedCapabilities = dot11HTCapabilitiesElement.bit15OfHtExtendedCapabilities;
            this.implicitTxBeamformingReceivingSupported = dot11HTCapabilitiesElement.implicitTxBeamformingReceivingSupported;
            this.rxStaggeredSoundingSupported = dot11HTCapabilitiesElement.rxStaggeredSoundingSupported;
            this.txStaggeredSoundingSupported = dot11HTCapabilitiesElement.txStaggeredSoundingSupported;
            this.rxNdpSupported = dot11HTCapabilitiesElement.rxNdpSupported;
            this.txNdpSupported = dot11HTCapabilitiesElement.txNdpSupported;
            this.implicitTxBeamformingSupported = dot11HTCapabilitiesElement.implicitTxBeamformingSupported;
            this.calibration = dot11HTCapabilitiesElement.calibration;
            this.explicitCsiTxBeamformingSupported = dot11HTCapabilitiesElement.explicitCsiTxBeamformingSupported;
            this.explicitNoncompressedSteeringSupported = dot11HTCapabilitiesElement.explicitNoncompressedSteeringSupported;
            this.explicitCompressedSteeringSupported = dot11HTCapabilitiesElement.explicitCompressedSteeringSupported;
            this.explicitTxBeamformingCsiFeedbackCapability = dot11HTCapabilitiesElement.explicitTxBeamformingCsiFeedbackCapability;
            this.explicitNoncompressedBeamformingFeedbackCapability = dot11HTCapabilitiesElement.explicitNoncompressedBeamformingFeedbackCapability;
            this.explicitCompressedBeamformingFeedbackCapability = dot11HTCapabilitiesElement.explicitCompressedBeamformingFeedbackCapability;
            this.minGrouping = dot11HTCapabilitiesElement.minGrouping;
            this.csiNumBeamformerAntennasSupported = dot11HTCapabilitiesElement.csiNumBeamformerAntennasSupported;
            this.noncompressedSteeringNumBeamformerAntennasSupported = dot11HTCapabilitiesElement.noncompressedSteeringNumBeamformerAntennasSupported;
            this.compressedSteeringNumBeamformerAntennasSupported = dot11HTCapabilitiesElement.compressedSteeringNumBeamformerAntennasSupported;
            this.csiMaxNumRowsBeamformerSupported = dot11HTCapabilitiesElement.csiMaxNumRowsBeamformerSupported;
            this.channelEstimationCapability = dot11HTCapabilitiesElement.channelEstimationCapability;
            this.bit29OfTransmitBeamformingCapabilities = dot11HTCapabilitiesElement.bit29OfTransmitBeamformingCapabilities;
            this.bit30OfTransmitBeamformingCapabilities = dot11HTCapabilitiesElement.bit30OfTransmitBeamformingCapabilities;
            this.bit31OfTransmitBeamformingCapabilities = dot11HTCapabilitiesElement.bit31OfTransmitBeamformingCapabilities;
            this.antennaSelectionSupported = dot11HTCapabilitiesElement.antennaSelectionSupported;
            this.explicitCsiFeedbackBasedTxAselSupported = dot11HTCapabilitiesElement.explicitCsiFeedbackBasedTxAselSupported;
            this.antennaIndicesFeedbackBasedTxAselSupported = dot11HTCapabilitiesElement.antennaIndicesFeedbackBasedTxAselSupported;
            this.explicitCsiFeedbackSupported = dot11HTCapabilitiesElement.explicitCsiFeedbackSupported;
            this.antennaIndicesFeedbackSupported = dot11HTCapabilitiesElement.antennaIndicesFeedbackSupported;
            this.rxAselSupported = dot11HTCapabilitiesElement.rxAselSupported;
            this.txSoundingPpdusSupported = dot11HTCapabilitiesElement.txSoundingPpdusSupported;
            this.bit7OfAselCapability = dot11HTCapabilitiesElement.bit7OfAselCapability;
        }
    }

    public enum Calibration {
        NOT_SUPPORTED(0, "Not supported"),
        RESPOND(1, "Respond"),
        RESERVED(2, "reserved"),
        INITIATE_AND_RESPOND(3, "Initiate and respond");

        private final String name;
        private final int value;

        Calibration(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static Calibration getInstance(int i) {
            for (Calibration calibration : values()) {
                if (calibration.value == i) {
                    return calibration;
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

    public enum ChannelEstimationCapability {
        ONE_SPACE_TIME_STREAM(0, "1 space-time stream"),
        TWO_SPACE_TIME_STREAMS(1, "2 space-time streams"),
        THREE_SPACE_TIME_STREAMS(2, "3 space-time streams"),
        FOUR_SPACE_TIME_STREAMS(3, "4 space-time streams");

        private final String name;
        private final int value;

        ChannelEstimationCapability(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static ChannelEstimationCapability getInstance(int i) {
            for (ChannelEstimationCapability channelEstimationCapability : values()) {
                if (channelEstimationCapability.value == i) {
                    return channelEstimationCapability;
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

    public enum CsiNumRows {
        SINGLE(0, "Single row of CSI"),
        TWO(1, "2 rows of CSI"),
        THREE(2, "3 rows of CSI"),
        FOUR(3, "4 rows of CSI");

        private final String name;
        private final int value;

        CsiNumRows(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static CsiNumRows getInstance(int i) {
            for (CsiNumRows csiNumRows : values()) {
                if (csiNumRows.value == i) {
                    return csiNumRows;
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

    public enum Grouping {
        NO_GROUPING(0, "No grouping"),
        GROUPS_OF_1_2(1, "Groups of 1, 2"),
        GROUPS_OF_1_4(2, "Groups of 1, 4"),
        GROUPS_OF_1_2_4(3, "Groups of 1, 2, 4");

        private final String name;
        private final int value;

        Grouping(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static Grouping getInstance(int i) {
            for (Grouping grouping : values()) {
                if (grouping.value == i) {
                    return grouping;
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

    public enum McsFeedbackCapability {
        NO_FEEDBACK(0, "No Feedback"),
        RESERVED(1, "reserved"),
        ONLY_UNSOLICITED(2, "Only unsolicited"),
        UNSOLICITED_AND_SOLICITED(3, "Unsolicited and solicited");

        private final String name;
        private final int value;

        McsFeedbackCapability(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static McsFeedbackCapability getInstance(int i) {
            for (McsFeedbackCapability mcsFeedbackCapability : values()) {
                if (mcsFeedbackCapability.value == i) {
                    return mcsFeedbackCapability;
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

    public enum MpduStartSpacing {
        NO_RESTRICTION(0, "No restriction"),
        ONE_FOURTH_US(1, "1/4 us"),
        HALF_US(2, "1/2 us"),
        ONE_US(3, "1 us"),
        TWO_US(4, "2 us"),
        FOUR_US(5, "4 us"),
        EIGHT_US(6, "8 us"),
        SIXTEEN_US(7, "16 us");

        private final String name;
        private final int value;

        MpduStartSpacing(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static MpduStartSpacing getInstance(int i) {
            for (MpduStartSpacing mpduStartSpacing : values()) {
                if (mpduStartSpacing.value == i) {
                    return mpduStartSpacing;
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

    public enum NumBeamformerAntennas {
        SINGLE(0, "Single Tx antenna sounding"),
        TWO(1, "2 Tx antenna sounding"),
        THREE(2, "3 Tx antenna sounding"),
        FOUR(3, "4 Tx antenna sounding");

        private final String name;
        private final int value;

        NumBeamformerAntennas(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static NumBeamformerAntennas getInstance(int i) {
            for (NumBeamformerAntennas numBeamformerAntennas : values()) {
                if (numBeamformerAntennas.value == i) {
                    return numBeamformerAntennas;
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

    public enum NumSpatialStreams {
        ONE(0, "1 spatial stream"),
        TWO(1, "2 spatial stream"),
        THREE(2, "3 spatial stream"),
        FOUR(3, "4 spatial stream");

        private final String name;
        private final int value;

        NumSpatialStreams(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static NumSpatialStreams getInstance(int i) {
            for (NumSpatialStreams numSpatialStreams : values()) {
                if (numSpatialStreams.value == i) {
                    return numSpatialStreams;
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

    public enum PcoTransitionTime {
        NO_TRANSITION(0, "No transition"),
        PTT_400_US(1, "400 us"),
        PTT_1_5_MS(2, "1.5 ms"),
        PTT_5_MS(3, "5 ms");

        private final String name;
        private final int value;

        PcoTransitionTime(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static PcoTransitionTime getInstance(int i) {
            for (PcoTransitionTime pcoTransitionTime : values()) {
                if (pcoTransitionTime.value == i) {
                    return pcoTransitionTime;
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

    public enum SmPowerSaveMode {
        STATIC(0),
        DYNAMIC(1),
        RESERVED(2),
        DISABLED(3);

        private final int value;

        SmPowerSaveMode(int i) {
            this.value = i;
        }

        public static SmPowerSaveMode getInstance(int i) {
            for (SmPowerSaveMode smPowerSaveMode : values()) {
                if (smPowerSaveMode.value == i) {
                    return smPowerSaveMode;
                }
            }
            throw new IllegalArgumentException(rm7.n(i, "Invalid value: "));
        }

        public int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            StringBuilder sb = new StringBuilder(20);
            sb.append(this.value);
            sb.append(" (");
            sb.append(name());
            sb.append(")");
            return sb.toString();
        }
    }

    public enum StbcSupport {
        NO_SUPPORT(0, "No support"),
        ONE_SPATIAL_STREAM(1, "One spatial stream is supported"),
        ONE_AND_TWO_SPATIAL_STREAMS(2, "One and two spatial streams are supported"),
        ONE_TWO_AND_THREE_SPATIAL_STREAMS(3, "One, two and three spatial streams are supported");

        private final String name;
        private final int value;

        StbcSupport(int i, String str) {
            this.value = i;
            this.name = str;
        }

        public static StbcSupport getInstance(int i) {
            for (StbcSupport stbcSupport : values()) {
                if (stbcSupport.value == i) {
                    return stbcSupport;
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
            StringBuilder sb = new StringBuilder(60);
            sb.append(this.value);
            sb.append(" (");
            return dw1.s(sb, this.name, ")");
        }
    }

    public static Dot11HTCapabilitiesElement newInstance(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        ByteArrays.validateBounds(bArr, i, i2);
        return new Dot11HTCapabilitiesElement(bArr, i, i2);
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || Dot11HTCapabilitiesElement.class != obj.getClass()) {
            return false;
        }
        Dot11HTCapabilitiesElement dot11HTCapabilitiesElement = (Dot11HTCapabilitiesElement) obj;
        return this.antennaIndicesFeedbackBasedTxAselSupported == dot11HTCapabilitiesElement.antennaIndicesFeedbackBasedTxAselSupported && this.antennaIndicesFeedbackSupported == dot11HTCapabilitiesElement.antennaIndicesFeedbackSupported && this.antennaSelectionSupported == dot11HTCapabilitiesElement.antennaSelectionSupported && this.bit101OfSupportedMcsSet == dot11HTCapabilitiesElement.bit101OfSupportedMcsSet && this.bit102OfSupportedMcsSet == dot11HTCapabilitiesElement.bit102OfSupportedMcsSet && this.bit103OfSupportedMcsSet == dot11HTCapabilitiesElement.bit103OfSupportedMcsSet && this.bit104OfSupportedMcsSet == dot11HTCapabilitiesElement.bit104OfSupportedMcsSet && this.bit105OfSupportedMcsSet == dot11HTCapabilitiesElement.bit105OfSupportedMcsSet && this.bit106OfSupportedMcsSet == dot11HTCapabilitiesElement.bit106OfSupportedMcsSet && this.bit107OfSupportedMcsSet == dot11HTCapabilitiesElement.bit107OfSupportedMcsSet && this.bit108OfSupportedMcsSet == dot11HTCapabilitiesElement.bit108OfSupportedMcsSet && this.bit109OfSupportedMcsSet == dot11HTCapabilitiesElement.bit109OfSupportedMcsSet && this.bit110OfSupportedMcsSet == dot11HTCapabilitiesElement.bit110OfSupportedMcsSet && this.bit111OfSupportedMcsSet == dot11HTCapabilitiesElement.bit111OfSupportedMcsSet && this.bit112OfSupportedMcsSet == dot11HTCapabilitiesElement.bit112OfSupportedMcsSet && this.bit113OfSupportedMcsSet == dot11HTCapabilitiesElement.bit113OfSupportedMcsSet && this.bit114OfSupportedMcsSet == dot11HTCapabilitiesElement.bit114OfSupportedMcsSet && this.bit115OfSupportedMcsSet == dot11HTCapabilitiesElement.bit115OfSupportedMcsSet && this.bit116OfSupportedMcsSet == dot11HTCapabilitiesElement.bit116OfSupportedMcsSet && this.bit117OfSupportedMcsSet == dot11HTCapabilitiesElement.bit117OfSupportedMcsSet && this.bit118OfSupportedMcsSet == dot11HTCapabilitiesElement.bit118OfSupportedMcsSet && this.bit119OfSupportedMcsSet == dot11HTCapabilitiesElement.bit119OfSupportedMcsSet && this.bit120OfSupportedMcsSet == dot11HTCapabilitiesElement.bit120OfSupportedMcsSet && this.bit121OfSupportedMcsSet == dot11HTCapabilitiesElement.bit121OfSupportedMcsSet && this.bit122OfSupportedMcsSet == dot11HTCapabilitiesElement.bit122OfSupportedMcsSet && this.bit123OfSupportedMcsSet == dot11HTCapabilitiesElement.bit123OfSupportedMcsSet && this.bit124OfSupportedMcsSet == dot11HTCapabilitiesElement.bit124OfSupportedMcsSet && this.bit125OfSupportedMcsSet == dot11HTCapabilitiesElement.bit125OfSupportedMcsSet && this.bit126OfSupportedMcsSet == dot11HTCapabilitiesElement.bit126OfSupportedMcsSet && this.bit127OfSupportedMcsSet == dot11HTCapabilitiesElement.bit127OfSupportedMcsSet && this.bit12OfHtExtendedCapabilities == dot11HTCapabilitiesElement.bit12OfHtExtendedCapabilities && this.bit13OfHtCapabilitiesInfo == dot11HTCapabilitiesElement.bit13OfHtCapabilitiesInfo && this.bit13OfHtExtendedCapabilities == dot11HTCapabilitiesElement.bit13OfHtExtendedCapabilities && this.bit14OfHtExtendedCapabilities == dot11HTCapabilitiesElement.bit14OfHtExtendedCapabilities && this.bit15OfHtExtendedCapabilities == dot11HTCapabilitiesElement.bit15OfHtExtendedCapabilities && this.bit29OfTransmitBeamformingCapabilities == dot11HTCapabilitiesElement.bit29OfTransmitBeamformingCapabilities && this.bit30OfTransmitBeamformingCapabilities == dot11HTCapabilitiesElement.bit30OfTransmitBeamformingCapabilities && this.bit31OfTransmitBeamformingCapabilities == dot11HTCapabilitiesElement.bit31OfTransmitBeamformingCapabilities && this.bit3OfHtExtendedCapabilities == dot11HTCapabilitiesElement.bit3OfHtExtendedCapabilities && this.bit4OfHtExtendedCapabilities == dot11HTCapabilitiesElement.bit4OfHtExtendedCapabilities && this.bit5OfAMpduParameters == dot11HTCapabilitiesElement.bit5OfAMpduParameters && this.bit5OfHtExtendedCapabilities == dot11HTCapabilitiesElement.bit5OfHtExtendedCapabilities && this.bit6OfAMpduParameters == dot11HTCapabilitiesElement.bit6OfAMpduParameters && this.bit6OfHtExtendedCapabilities == dot11HTCapabilitiesElement.bit6OfHtExtendedCapabilities && this.bit77OfSupportedMcsSet == dot11HTCapabilitiesElement.bit77OfSupportedMcsSet && this.bit78OfSupportedMcsSet == dot11HTCapabilitiesElement.bit78OfSupportedMcsSet && this.bit79OfSupportedMcsSet == dot11HTCapabilitiesElement.bit79OfSupportedMcsSet && this.bit7OfAMpduParameters == dot11HTCapabilitiesElement.bit7OfAMpduParameters && this.bit7OfAselCapability == dot11HTCapabilitiesElement.bit7OfAselCapability && this.bit7OfHtExtendedCapabilities == dot11HTCapabilitiesElement.bit7OfHtExtendedCapabilities && this.bit90OfSupportedMcsSet == dot11HTCapabilitiesElement.bit90OfSupportedMcsSet && this.bit91OfSupportedMcsSet == dot11HTCapabilitiesElement.bit91OfSupportedMcsSet && this.bit92OfSupportedMcsSet == dot11HTCapabilitiesElement.bit92OfSupportedMcsSet && this.bit93OfSupportedMcsSet == dot11HTCapabilitiesElement.bit93OfSupportedMcsSet && this.bit94OfSupportedMcsSet == dot11HTCapabilitiesElement.bit94OfSupportedMcsSet && this.bit95OfSupportedMcsSet == dot11HTCapabilitiesElement.bit95OfSupportedMcsSet && this.both20and40MhzSupported == dot11HTCapabilitiesElement.both20and40MhzSupported && this.calibration == dot11HTCapabilitiesElement.calibration && this.channelEstimationCapability == dot11HTCapabilitiesElement.channelEstimationCapability && this.compressedSteeringNumBeamformerAntennasSupported == dot11HTCapabilitiesElement.compressedSteeringNumBeamformerAntennasSupported && this.csiMaxNumRowsBeamformerSupported == dot11HTCapabilitiesElement.csiMaxNumRowsBeamformerSupported && this.csiNumBeamformerAntennasSupported == dot11HTCapabilitiesElement.csiNumBeamformerAntennasSupported && this.dsssCckModeIn40MhzSupported == dot11HTCapabilitiesElement.dsssCckModeIn40MhzSupported && this.explicitCompressedBeamformingFeedbackCapability == dot11HTCapabilitiesElement.explicitCompressedBeamformingFeedbackCapability && this.explicitCompressedSteeringSupported == dot11HTCapabilitiesElement.explicitCompressedSteeringSupported && this.explicitCsiFeedbackBasedTxAselSupported == dot11HTCapabilitiesElement.explicitCsiFeedbackBasedTxAselSupported && this.explicitCsiFeedbackSupported == dot11HTCapabilitiesElement.explicitCsiFeedbackSupported && this.explicitCsiTxBeamformingSupported == dot11HTCapabilitiesElement.explicitCsiTxBeamformingSupported && this.explicitNoncompressedBeamformingFeedbackCapability == dot11HTCapabilitiesElement.explicitNoncompressedBeamformingFeedbackCapability && this.explicitNoncompressedSteeringSupported == dot11HTCapabilitiesElement.explicitNoncompressedSteeringSupported && this.explicitTxBeamformingCsiFeedbackCapability == dot11HTCapabilitiesElement.explicitTxBeamformingCsiFeedbackCapability && this.fortyMhzIntolerant == dot11HTCapabilitiesElement.fortyMhzIntolerant && this.htControlFieldSupported == dot11HTCapabilitiesElement.htControlFieldSupported && this.htDelayedBlockAckSupported == dot11HTCapabilitiesElement.htDelayedBlockAckSupported && this.htGreenfieldSupported == dot11HTCapabilitiesElement.htGreenfieldSupported && this.implicitTxBeamformingReceivingSupported == dot11HTCapabilitiesElement.implicitTxBeamformingReceivingSupported && this.implicitTxBeamformingSupported == dot11HTCapabilitiesElement.implicitTxBeamformingSupported && this.lSigTxopProtectionSupported == dot11HTCapabilitiesElement.lSigTxopProtectionSupported && this.ldpcCodingSupported == dot11HTCapabilitiesElement.ldpcCodingSupported && this.maxAMpduLength == dot11HTCapabilitiesElement.maxAMpduLength && this.maxAMsduLength == dot11HTCapabilitiesElement.maxAMsduLength && this.mcsFeedbackCapability == dot11HTCapabilitiesElement.mcsFeedbackCapability && this.minGrouping == dot11HTCapabilitiesElement.minGrouping && this.minMpduStartSpacing == dot11HTCapabilitiesElement.minMpduStartSpacing && this.noncompressedSteeringNumBeamformerAntennasSupported == dot11HTCapabilitiesElement.noncompressedSteeringNumBeamformerAntennasSupported && this.pcoSupported == dot11HTCapabilitiesElement.pcoSupported && this.pcoTransitionTime == dot11HTCapabilitiesElement.pcoTransitionTime && this.rdResponderSupported == dot11HTCapabilitiesElement.rdResponderSupported && this.rxAselSupported == dot11HTCapabilitiesElement.rxAselSupported && this.rxHighestSupportedDataRate == dot11HTCapabilitiesElement.rxHighestSupportedDataRate && this.rxNdpSupported == dot11HTCapabilitiesElement.rxNdpSupported && this.rxStaggeredSoundingSupported == dot11HTCapabilitiesElement.rxStaggeredSoundingSupported && this.rxStbcSupport == dot11HTCapabilitiesElement.rxStbcSupport && this.shortGiFor20MhzSupported == dot11HTCapabilitiesElement.shortGiFor20MhzSupported && this.shortGiFor40MhzSupported == dot11HTCapabilitiesElement.shortGiFor40MhzSupported && this.smPowerSaveMode == dot11HTCapabilitiesElement.smPowerSaveMode && Arrays.equals(this.supportedRxMcsIndexes, dot11HTCapabilitiesElement.supportedRxMcsIndexes) && this.txMaxNumSpatialStreamsSupported == dot11HTCapabilitiesElement.txMaxNumSpatialStreamsSupported && this.txMcsSetDefined == dot11HTCapabilitiesElement.txMcsSetDefined && this.txNdpSupported == dot11HTCapabilitiesElement.txNdpSupported && this.txRxMcsSetNotEqual == dot11HTCapabilitiesElement.txRxMcsSetNotEqual && this.txSoundingPpdusSupported == dot11HTCapabilitiesElement.txSoundingPpdusSupported && this.txStaggeredSoundingSupported == dot11HTCapabilitiesElement.txStaggeredSoundingSupported && this.txStbcSupported == dot11HTCapabilitiesElement.txStbcSupported && this.txUnequalModulationSupported == dot11HTCapabilitiesElement.txUnequalModulationSupported;
    }

    public boolean getBit101OfSupportedMcsSet() {
        return this.bit101OfSupportedMcsSet;
    }

    public boolean getBit102OfSupportedMcsSet() {
        return this.bit102OfSupportedMcsSet;
    }

    public boolean getBit103OfSupportedMcsSet() {
        return this.bit103OfSupportedMcsSet;
    }

    public boolean getBit104OfSupportedMcsSet() {
        return this.bit104OfSupportedMcsSet;
    }

    public boolean getBit105OfSupportedMcsSet() {
        return this.bit105OfSupportedMcsSet;
    }

    public boolean getBit106OfSupportedMcsSet() {
        return this.bit106OfSupportedMcsSet;
    }

    public boolean getBit107OfSupportedMcsSet() {
        return this.bit107OfSupportedMcsSet;
    }

    public boolean getBit108OfSupportedMcsSet() {
        return this.bit108OfSupportedMcsSet;
    }

    public boolean getBit109OfSupportedMcsSet() {
        return this.bit109OfSupportedMcsSet;
    }

    public boolean getBit110OfSupportedMcsSet() {
        return this.bit110OfSupportedMcsSet;
    }

    public boolean getBit111OfSupportedMcsSet() {
        return this.bit111OfSupportedMcsSet;
    }

    public boolean getBit112OfSupportedMcsSet() {
        return this.bit112OfSupportedMcsSet;
    }

    public boolean getBit113OfSupportedMcsSet() {
        return this.bit113OfSupportedMcsSet;
    }

    public boolean getBit114OfSupportedMcsSet() {
        return this.bit114OfSupportedMcsSet;
    }

    public boolean getBit115OfSupportedMcsSet() {
        return this.bit115OfSupportedMcsSet;
    }

    public boolean getBit116OfSupportedMcsSet() {
        return this.bit116OfSupportedMcsSet;
    }

    public boolean getBit117OfSupportedMcsSet() {
        return this.bit117OfSupportedMcsSet;
    }

    public boolean getBit118OfSupportedMcsSet() {
        return this.bit118OfSupportedMcsSet;
    }

    public boolean getBit119OfSupportedMcsSet() {
        return this.bit119OfSupportedMcsSet;
    }

    public boolean getBit120OfSupportedMcsSet() {
        return this.bit120OfSupportedMcsSet;
    }

    public boolean getBit121OfSupportedMcsSet() {
        return this.bit121OfSupportedMcsSet;
    }

    public boolean getBit122OfSupportedMcsSet() {
        return this.bit122OfSupportedMcsSet;
    }

    public boolean getBit123OfSupportedMcsSet() {
        return this.bit123OfSupportedMcsSet;
    }

    public boolean getBit124OfSupportedMcsSet() {
        return this.bit124OfSupportedMcsSet;
    }

    public boolean getBit125OfSupportedMcsSet() {
        return this.bit125OfSupportedMcsSet;
    }

    public boolean getBit126OfSupportedMcsSet() {
        return this.bit126OfSupportedMcsSet;
    }

    public boolean getBit127OfSupportedMcsSet() {
        return this.bit127OfSupportedMcsSet;
    }

    public boolean getBit12OfHtExtendedCapabilities() {
        return this.bit12OfHtExtendedCapabilities;
    }

    public boolean getBit13OfHtCapabilitiesInfo() {
        return this.bit13OfHtCapabilitiesInfo;
    }

    public boolean getBit13OfHtExtendedCapabilities() {
        return this.bit13OfHtExtendedCapabilities;
    }

    public boolean getBit14OfHtExtendedCapabilities() {
        return this.bit14OfHtExtendedCapabilities;
    }

    public boolean getBit15OfHtExtendedCapabilities() {
        return this.bit15OfHtExtendedCapabilities;
    }

    public boolean getBit29OfTransmitBeamformingCapabilities() {
        return this.bit29OfTransmitBeamformingCapabilities;
    }

    public boolean getBit30OfTransmitBeamformingCapabilities() {
        return this.bit30OfTransmitBeamformingCapabilities;
    }

    public boolean getBit31OfTransmitBeamformingCapabilities() {
        return this.bit31OfTransmitBeamformingCapabilities;
    }

    public boolean getBit3OfHtExtendedCapabilities() {
        return this.bit3OfHtExtendedCapabilities;
    }

    public boolean getBit4OfHtExtendedCapabilities() {
        return this.bit4OfHtExtendedCapabilities;
    }

    public boolean getBit5OfAMpduParameters() {
        return this.bit5OfAMpduParameters;
    }

    public boolean getBit5OfHtExtendedCapabilities() {
        return this.bit5OfHtExtendedCapabilities;
    }

    public boolean getBit6OfAMpduParameters() {
        return this.bit6OfAMpduParameters;
    }

    public boolean getBit6OfHtExtendedCapabilities() {
        return this.bit6OfHtExtendedCapabilities;
    }

    public boolean getBit77OfSupportedMcsSet() {
        return this.bit77OfSupportedMcsSet;
    }

    public boolean getBit78OfSupportedMcsSet() {
        return this.bit78OfSupportedMcsSet;
    }

    public boolean getBit79OfSupportedMcsSet() {
        return this.bit79OfSupportedMcsSet;
    }

    public boolean getBit7OfAMpduParameters() {
        return this.bit7OfAMpduParameters;
    }

    public boolean getBit7OfAselCapability() {
        return this.bit7OfAselCapability;
    }

    public boolean getBit7OfHtExtendedCapabilities() {
        return this.bit7OfHtExtendedCapabilities;
    }

    public boolean getBit90OfSupportedMcsSet() {
        return this.bit90OfSupportedMcsSet;
    }

    public boolean getBit91OfSupportedMcsSet() {
        return this.bit91OfSupportedMcsSet;
    }

    public boolean getBit92OfSupportedMcsSet() {
        return this.bit92OfSupportedMcsSet;
    }

    public boolean getBit93OfSupportedMcsSet() {
        return this.bit93OfSupportedMcsSet;
    }

    public boolean getBit94OfSupportedMcsSet() {
        return this.bit94OfSupportedMcsSet;
    }

    public boolean getBit95OfSupportedMcsSet() {
        return this.bit95OfSupportedMcsSet;
    }

    public Builder getBuilder() {
        return new Builder();
    }

    public Calibration getCalibration() {
        return this.calibration;
    }

    public ChannelEstimationCapability getChannelEstimationCapability() {
        return this.channelEstimationCapability;
    }

    public NumBeamformerAntennas getCompressedSteeringNumBeamformerAntennasSupported() {
        return this.compressedSteeringNumBeamformerAntennasSupported;
    }

    public CsiNumRows getCsiMaxNumRowsBeamformerSupported() {
        return this.csiMaxNumRowsBeamformerSupported;
    }

    public NumBeamformerAntennas getCsiNumBeamformerAntennasSupported() {
        return this.csiNumBeamformerAntennasSupported;
    }

    public BeamformingFeedbackCapability getExplicitCompressedBeamformingFeedbackCapability() {
        return this.explicitCompressedBeamformingFeedbackCapability;
    }

    public BeamformingFeedbackCapability getExplicitNoncompressedBeamformingFeedbackCapability() {
        return this.explicitNoncompressedBeamformingFeedbackCapability;
    }

    public BeamformingFeedbackCapability getExplicitTxBeamformingCsiFeedbackCapability() {
        return this.explicitTxBeamformingCsiFeedbackCapability;
    }

    public AMpduLength getMaxAMpduLength() {
        return this.maxAMpduLength;
    }

    public AMsduLength getMaxAMsduLength() {
        return this.maxAMsduLength;
    }

    public McsFeedbackCapability getMcsFeedbackCapability() {
        return this.mcsFeedbackCapability;
    }

    public Grouping getMinGrouping() {
        return this.minGrouping;
    }

    public MpduStartSpacing getMinMpduStartSpacing() {
        return this.minMpduStartSpacing;
    }

    public NumBeamformerAntennas getNoncompressedSteeringNumBeamformerAntennasSupported() {
        return this.noncompressedSteeringNumBeamformerAntennasSupported;
    }

    public PcoTransitionTime getPcoTransitionTime() {
        return this.pcoTransitionTime;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public byte[] getRawData() {
        byte[] bArr = new byte[length()];
        bArr[0] = getElementId().value().byteValue();
        bArr[1] = getLength();
        byte b = (byte) (this.smPowerSaveMode.value << 2);
        bArr[2] = b;
        if (this.ldpcCodingSupported) {
            bArr[2] = (byte) (b | 1);
        }
        if (this.both20and40MhzSupported) {
            bArr[2] = (byte) (bArr[2] | 2);
        }
        if (this.htGreenfieldSupported) {
            bArr[2] = (byte) (bArr[2] | 16);
        }
        if (this.shortGiFor20MhzSupported) {
            bArr[2] = (byte) (bArr[2] | 32);
        }
        if (this.shortGiFor40MhzSupported) {
            bArr[2] = (byte) (bArr[2] | 64);
        }
        if (this.txStbcSupported) {
            bArr[2] = (byte) (bArr[2] | 128);
        }
        byte b2 = (byte) (this.rxStbcSupport.value | (this.maxAMsduLength.value << 3));
        bArr[3] = b2;
        if (this.htDelayedBlockAckSupported) {
            bArr[3] = (byte) (b2 | 4);
        }
        if (this.dsssCckModeIn40MhzSupported) {
            bArr[3] = (byte) (bArr[3] | 16);
        }
        if (this.bit13OfHtCapabilitiesInfo) {
            bArr[3] = (byte) (bArr[3] | 32);
        }
        if (this.fortyMhzIntolerant) {
            bArr[3] = (byte) (bArr[3] | 64);
        }
        if (this.lSigTxopProtectionSupported) {
            bArr[3] = (byte) (bArr[3] | 128);
        }
        byte b3 = (byte) (this.maxAMpduLength.value | (this.minMpduStartSpacing.value << 2));
        bArr[4] = b3;
        if (this.bit5OfAMpduParameters) {
            bArr[4] = (byte) (b3 | 32);
        }
        if (this.bit6OfAMpduParameters) {
            bArr[4] = (byte) (bArr[4] | 64);
        }
        if (this.bit7OfAMpduParameters) {
            bArr[4] = (byte) (bArr[4] | 128);
        }
        int i = 0;
        while (true) {
            boolean[] zArr = this.supportedRxMcsIndexes;
            if (i >= zArr.length) {
                if (this.bit77OfSupportedMcsSet) {
                    bArr[14] = (byte) (bArr[14] | 32);
                }
                if (this.bit78OfSupportedMcsSet) {
                    bArr[14] = (byte) (bArr[14] | 64);
                }
                if (this.bit79OfSupportedMcsSet) {
                    bArr[14] = (byte) (bArr[14] | 128);
                }
                short s = this.rxHighestSupportedDataRate;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                System.arraycopy(ByteArrays.toByteArray(s, byteOrder), 0, bArr, 15, 2);
                if (this.bit90OfSupportedMcsSet) {
                    bArr[16] = (byte) (bArr[16] | 4);
                }
                if (this.bit91OfSupportedMcsSet) {
                    bArr[16] = (byte) (bArr[16] | 8);
                }
                if (this.bit92OfSupportedMcsSet) {
                    bArr[16] = (byte) (bArr[16] | 16);
                }
                if (this.bit93OfSupportedMcsSet) {
                    bArr[16] = (byte) (bArr[16] | 32);
                }
                if (this.bit94OfSupportedMcsSet) {
                    bArr[16] = (byte) (bArr[16] | 64);
                }
                if (this.bit95OfSupportedMcsSet) {
                    bArr[16] = (byte) (bArr[16] | 128);
                }
                byte b4 = (byte) (this.txMaxNumSpatialStreamsSupported.value << 2);
                bArr[17] = b4;
                if (this.txMcsSetDefined) {
                    bArr[17] = (byte) (b4 | 1);
                }
                if (this.txRxMcsSetNotEqual) {
                    bArr[17] = (byte) (bArr[17] | 2);
                }
                if (this.txUnequalModulationSupported) {
                    bArr[17] = (byte) (bArr[17] | 16);
                }
                if (this.bit101OfSupportedMcsSet) {
                    bArr[17] = (byte) (bArr[17] | 32);
                }
                if (this.bit102OfSupportedMcsSet) {
                    bArr[17] = (byte) (bArr[17] | 64);
                }
                if (this.bit103OfSupportedMcsSet) {
                    bArr[17] = (byte) (bArr[17] | 128);
                }
                if (this.bit104OfSupportedMcsSet) {
                    bArr[18] = (byte) (bArr[18] | 1);
                }
                if (this.bit105OfSupportedMcsSet) {
                    bArr[18] = (byte) (bArr[18] | 2);
                }
                if (this.bit106OfSupportedMcsSet) {
                    bArr[18] = (byte) (bArr[18] | 4);
                }
                if (this.bit107OfSupportedMcsSet) {
                    bArr[18] = (byte) (bArr[18] | 8);
                }
                if (this.bit108OfSupportedMcsSet) {
                    bArr[18] = (byte) (bArr[18] | 16);
                }
                if (this.bit109OfSupportedMcsSet) {
                    bArr[18] = (byte) (bArr[18] | 32);
                }
                if (this.bit110OfSupportedMcsSet) {
                    bArr[18] = (byte) (bArr[18] | 64);
                }
                if (this.bit111OfSupportedMcsSet) {
                    bArr[18] = (byte) (bArr[18] | 128);
                }
                if (this.bit112OfSupportedMcsSet) {
                    bArr[19] = (byte) (bArr[19] | 1);
                }
                if (this.bit113OfSupportedMcsSet) {
                    bArr[19] = (byte) (bArr[19] | 2);
                }
                if (this.bit114OfSupportedMcsSet) {
                    bArr[19] = (byte) (bArr[19] | 4);
                }
                if (this.bit115OfSupportedMcsSet) {
                    bArr[19] = (byte) (bArr[19] | 8);
                }
                if (this.bit116OfSupportedMcsSet) {
                    bArr[19] = (byte) (bArr[19] | 16);
                }
                if (this.bit117OfSupportedMcsSet) {
                    bArr[19] = (byte) (bArr[19] | 32);
                }
                if (this.bit118OfSupportedMcsSet) {
                    bArr[19] = (byte) (bArr[19] | 64);
                }
                if (this.bit119OfSupportedMcsSet) {
                    bArr[19] = (byte) (bArr[19] | 128);
                }
                if (this.bit120OfSupportedMcsSet) {
                    bArr[20] = (byte) (bArr[20] | 1);
                }
                if (this.bit121OfSupportedMcsSet) {
                    bArr[20] = (byte) (bArr[20] | 2);
                }
                if (this.bit122OfSupportedMcsSet) {
                    bArr[20] = (byte) (bArr[20] | 4);
                }
                if (this.bit123OfSupportedMcsSet) {
                    bArr[20] = (byte) (bArr[20] | 8);
                }
                if (this.bit124OfSupportedMcsSet) {
                    bArr[20] = (byte) (bArr[20] | 16);
                }
                if (this.bit125OfSupportedMcsSet) {
                    bArr[20] = (byte) (bArr[20] | 32);
                }
                if (this.bit126OfSupportedMcsSet) {
                    bArr[20] = (byte) (bArr[20] | 64);
                }
                if (this.bit127OfSupportedMcsSet) {
                    bArr[20] = (byte) (bArr[20] | 128);
                }
                byte b5 = (byte) (this.pcoTransitionTime.value << 1);
                bArr[21] = b5;
                if (this.pcoSupported) {
                    bArr[21] = (byte) (b5 | 1);
                }
                if (this.bit3OfHtExtendedCapabilities) {
                    bArr[21] = (byte) (bArr[21] | 8);
                }
                if (this.bit4OfHtExtendedCapabilities) {
                    bArr[21] = (byte) (bArr[21] | 16);
                }
                if (this.bit5OfHtExtendedCapabilities) {
                    bArr[21] = (byte) (bArr[21] | 32);
                }
                if (this.bit6OfHtExtendedCapabilities) {
                    bArr[21] = (byte) (bArr[21] | 64);
                }
                if (this.bit7OfHtExtendedCapabilities) {
                    bArr[21] = (byte) (bArr[21] | 128);
                }
                byte b6 = (byte) this.mcsFeedbackCapability.value;
                bArr[22] = b6;
                if (this.htControlFieldSupported) {
                    bArr[22] = (byte) (b6 | 4);
                }
                if (this.rdResponderSupported) {
                    bArr[22] = (byte) (bArr[22] | 8);
                }
                if (this.bit12OfHtExtendedCapabilities) {
                    bArr[22] = (byte) (bArr[22] | 16);
                }
                if (this.bit13OfHtExtendedCapabilities) {
                    bArr[22] = (byte) (bArr[22] | 32);
                }
                if (this.bit14OfHtExtendedCapabilities) {
                    bArr[22] = (byte) (bArr[22] | 64);
                }
                if (this.bit15OfHtExtendedCapabilities) {
                    bArr[22] = (byte) (bArr[22] | 128);
                }
                byte b7 = (byte) (this.calibration.value << 6);
                bArr[23] = b7;
                if (this.implicitTxBeamformingReceivingSupported) {
                    bArr[23] = (byte) (b7 | 1);
                }
                if (this.rxStaggeredSoundingSupported) {
                    bArr[23] = (byte) (bArr[23] | 2);
                }
                if (this.txStaggeredSoundingSupported) {
                    bArr[23] = (byte) (bArr[23] | 4);
                }
                if (this.rxNdpSupported) {
                    bArr[23] = (byte) (bArr[23] | 8);
                }
                if (this.txNdpSupported) {
                    bArr[23] = (byte) (bArr[23] | 16);
                }
                if (this.implicitTxBeamformingSupported) {
                    bArr[23] = (byte) (bArr[23] | 32);
                }
                int i2 = (this.explicitTxBeamformingCsiFeedbackCapability.value << 3) | (this.explicitNoncompressedBeamformingFeedbackCapability.value << 5) | (this.explicitCompressedBeamformingFeedbackCapability.value << 7) | (this.minGrouping.value << 9) | (this.csiNumBeamformerAntennasSupported.value << 11) | (this.noncompressedSteeringNumBeamformerAntennasSupported.value << 13) | (this.compressedSteeringNumBeamformerAntennasSupported.value << 15) | (this.csiMaxNumRowsBeamformerSupported.value << 17) | (this.channelEstimationCapability.value << 19);
                if (this.explicitCsiTxBeamformingSupported) {
                    i2 |= 1;
                }
                if (this.explicitNoncompressedSteeringSupported) {
                    i2 |= 2;
                }
                if (this.explicitCompressedSteeringSupported) {
                    i2 |= 4;
                }
                if (this.bit29OfTransmitBeamformingCapabilities) {
                    i2 |= 2097152;
                }
                if (this.bit30OfTransmitBeamformingCapabilities) {
                    i2 |= 4194304;
                }
                if (this.bit31OfTransmitBeamformingCapabilities) {
                    i2 |= 8388608;
                }
                if (this.antennaSelectionSupported) {
                    i2 |= 16777216;
                }
                if (this.explicitCsiFeedbackBasedTxAselSupported) {
                    i2 |= 33554432;
                }
                if (this.antennaIndicesFeedbackBasedTxAselSupported) {
                    i2 |= 67108864;
                }
                if (this.explicitCsiFeedbackSupported) {
                    i2 |= 134217728;
                }
                if (this.antennaIndicesFeedbackSupported) {
                    i2 |= 268435456;
                }
                if (this.rxAselSupported) {
                    i2 |= 536870912;
                }
                if (this.txSoundingPpdusSupported) {
                    i2 |= 1073741824;
                }
                if (this.bit7OfAselCapability) {
                    i2 |= Integer.MIN_VALUE;
                }
                System.arraycopy(ByteArrays.toByteArray(i2, byteOrder), 0, bArr, 24, 4);
                return bArr;
            }
            if (zArr[i]) {
                int i3 = (i / 8) + 5;
                switch (i % 8) {
                    case 0:
                        bArr[i3] = (byte) (bArr[i3] | 1);
                        break;
                    case 1:
                        bArr[i3] = (byte) (bArr[i3] | 2);
                        break;
                    case 2:
                        bArr[i3] = (byte) (bArr[i3] | 4);
                        break;
                    case 3:
                        bArr[i3] = (byte) (bArr[i3] | 8);
                        break;
                    case 4:
                        bArr[i3] = (byte) (bArr[i3] | 16);
                        break;
                    case 5:
                        bArr[i3] = (byte) (bArr[i3] | 32);
                        break;
                    case 6:
                        bArr[i3] = (byte) (bArr[i3] | 64);
                        break;
                    case 7:
                        bArr[i3] = (byte) (bArr[i3] | 128);
                        break;
                }
            }
            i++;
        }
    }

    public short getRxHighestSupportedDataRate() {
        return this.rxHighestSupportedDataRate;
    }

    public int getRxHighestSupportedDataRateAsInt() {
        return this.rxHighestSupportedDataRate;
    }

    public StbcSupport getRxStbcSupport() {
        return this.rxStbcSupport;
    }

    public SmPowerSaveMode getSmPowerSaveMode() {
        return this.smPowerSaveMode;
    }

    public boolean[] getSupportedRxMcsIndexes() {
        boolean[] zArr = new boolean[77];
        System.arraycopy(this.supportedRxMcsIndexes, 0, zArr, 0, 77);
        return zArr;
    }

    public NumSpatialStreams getTxMaxNumSpatialStreamsSupported() {
        return this.txMaxNumSpatialStreamsSupported;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int hashCode() {
        return ((((((((((((((this.txMaxNumSpatialStreamsSupported.hashCode() + ((Arrays.hashCode(this.supportedRxMcsIndexes) + ((this.smPowerSaveMode.hashCode() + ((((((this.rxStbcSupport.hashCode() + ((((((((((((this.pcoTransitionTime.hashCode() + ((((this.noncompressedSteeringNumBeamformerAntennasSupported.hashCode() + ((this.minMpduStartSpacing.hashCode() + ((this.minGrouping.hashCode() + ((this.mcsFeedbackCapability.hashCode() + ((this.maxAMsduLength.hashCode() + ((this.maxAMpduLength.hashCode() + ((((((((((((((((((this.explicitTxBeamformingCsiFeedbackCapability.hashCode() + ((((this.explicitNoncompressedBeamformingFeedbackCapability.hashCode() + ((((((((((this.explicitCompressedBeamformingFeedbackCapability.hashCode() + ((((this.csiNumBeamformerAntennasSupported.hashCode() + ((this.csiMaxNumRowsBeamformerSupported.hashCode() + ((this.compressedSteeringNumBeamformerAntennasSupported.hashCode() + ((this.channelEstimationCapability.hashCode() + ((this.calibration.hashCode() + (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + (this.antennaIndicesFeedbackBasedTxAselSupported ? 1231 : 1237)) * 31) + (this.antennaIndicesFeedbackSupported ? 1231 : 1237)) * 31) + (this.antennaSelectionSupported ? 1231 : 1237)) * 31) + (this.bit101OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit102OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit103OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit104OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit105OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit106OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit107OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit108OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit109OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit110OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit111OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit112OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit113OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit114OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit115OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit116OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit117OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit118OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit119OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit120OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit121OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit122OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit123OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit124OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit125OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit126OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit127OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit12OfHtExtendedCapabilities ? 1231 : 1237)) * 31) + (this.bit13OfHtCapabilitiesInfo ? 1231 : 1237)) * 31) + (this.bit13OfHtExtendedCapabilities ? 1231 : 1237)) * 31) + (this.bit14OfHtExtendedCapabilities ? 1231 : 1237)) * 31) + (this.bit15OfHtExtendedCapabilities ? 1231 : 1237)) * 31) + (this.bit29OfTransmitBeamformingCapabilities ? 1231 : 1237)) * 31) + (this.bit30OfTransmitBeamformingCapabilities ? 1231 : 1237)) * 31) + (this.bit31OfTransmitBeamformingCapabilities ? 1231 : 1237)) * 31) + (this.bit3OfHtExtendedCapabilities ? 1231 : 1237)) * 31) + (this.bit4OfHtExtendedCapabilities ? 1231 : 1237)) * 31) + (this.bit5OfAMpduParameters ? 1231 : 1237)) * 31) + (this.bit5OfHtExtendedCapabilities ? 1231 : 1237)) * 31) + (this.bit6OfAMpduParameters ? 1231 : 1237)) * 31) + (this.bit6OfHtExtendedCapabilities ? 1231 : 1237)) * 31) + (this.bit77OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit78OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit79OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit7OfAMpduParameters ? 1231 : 1237)) * 31) + (this.bit7OfAselCapability ? 1231 : 1237)) * 31) + (this.bit7OfHtExtendedCapabilities ? 1231 : 1237)) * 31) + (this.bit90OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit91OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit92OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit93OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit94OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.bit95OfSupportedMcsSet ? 1231 : 1237)) * 31) + (this.both20and40MhzSupported ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.dsssCckModeIn40MhzSupported ? 1231 : 1237)) * 31)) * 31) + (this.explicitCompressedSteeringSupported ? 1231 : 1237)) * 31) + (this.explicitCsiFeedbackBasedTxAselSupported ? 1231 : 1237)) * 31) + (this.explicitCsiFeedbackSupported ? 1231 : 1237)) * 31) + (this.explicitCsiTxBeamformingSupported ? 1231 : 1237)) * 31)) * 31) + (this.explicitNoncompressedSteeringSupported ? 1231 : 1237)) * 31)) * 31) + (this.fortyMhzIntolerant ? 1231 : 1237)) * 31) + (this.htControlFieldSupported ? 1231 : 1237)) * 31) + (this.htDelayedBlockAckSupported ? 1231 : 1237)) * 31) + (this.htGreenfieldSupported ? 1231 : 1237)) * 31) + (this.implicitTxBeamformingReceivingSupported ? 1231 : 1237)) * 31) + (this.implicitTxBeamformingSupported ? 1231 : 1237)) * 31) + (this.lSigTxopProtectionSupported ? 1231 : 1237)) * 31) + (this.ldpcCodingSupported ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.pcoSupported ? 1231 : 1237)) * 31)) * 31) + (this.rdResponderSupported ? 1231 : 1237)) * 31) + (this.rxAselSupported ? 1231 : 1237)) * 31) + this.rxHighestSupportedDataRate) * 31) + (this.rxNdpSupported ? 1231 : 1237)) * 31) + (this.rxStaggeredSoundingSupported ? 1231 : 1237)) * 31)) * 31) + (this.shortGiFor20MhzSupported ? 1231 : 1237)) * 31) + (this.shortGiFor40MhzSupported ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31) + (this.txMcsSetDefined ? 1231 : 1237)) * 31) + (this.txNdpSupported ? 1231 : 1237)) * 31) + (this.txRxMcsSetNotEqual ? 1231 : 1237)) * 31) + (this.txSoundingPpdusSupported ? 1231 : 1237)) * 31) + (this.txStaggeredSoundingSupported ? 1231 : 1237)) * 31) + (this.txStbcSupported ? 1231 : 1237)) * 31) + (this.txUnequalModulationSupported ? 1231 : 1237);
    }

    public boolean isAntennaIndicesFeedbackBasedTxAselSupported() {
        return this.antennaIndicesFeedbackBasedTxAselSupported;
    }

    public boolean isAntennaIndicesFeedbackSupported() {
        return this.antennaIndicesFeedbackSupported;
    }

    public boolean isAntennaSelectionSupported() {
        return this.antennaSelectionSupported;
    }

    public boolean isBoth20and40MhzSupported() {
        return this.both20and40MhzSupported;
    }

    public boolean isDsssCckModeIn40MhzSupported() {
        return this.dsssCckModeIn40MhzSupported;
    }

    public boolean isExplicitCompressedSteeringSupported() {
        return this.explicitCompressedSteeringSupported;
    }

    public boolean isExplicitCsiFeedbackBasedTxAselSupported() {
        return this.explicitCsiFeedbackBasedTxAselSupported;
    }

    public boolean isExplicitCsiFeedbackSupported() {
        return this.explicitCsiFeedbackSupported;
    }

    public boolean isExplicitCsiTxBeamformingSupported() {
        return this.explicitCsiTxBeamformingSupported;
    }

    public boolean isExplicitNoncompressedSteeringSupported() {
        return this.explicitNoncompressedSteeringSupported;
    }

    public boolean isFortyMhzIntolerant() {
        return this.fortyMhzIntolerant;
    }

    public boolean isHtControlFieldSupported() {
        return this.htControlFieldSupported;
    }

    public boolean isHtDelayedBlockAckSupported() {
        return this.htDelayedBlockAckSupported;
    }

    public boolean isHtGreenfieldSupported() {
        return this.htGreenfieldSupported;
    }

    public boolean isImplicitTxBeamformingReceivingSupported() {
        return this.implicitTxBeamformingReceivingSupported;
    }

    public boolean isImplicitTxBeamformingSupported() {
        return this.implicitTxBeamformingSupported;
    }

    public boolean isLdpcCodingSupported() {
        return this.ldpcCodingSupported;
    }

    public boolean isPcoSupported() {
        return this.pcoSupported;
    }

    public boolean isRdResponderSupported() {
        return this.rdResponderSupported;
    }

    public boolean isRxAselSupported() {
        return this.rxAselSupported;
    }

    public boolean isRxNdpSupported() {
        return this.rxNdpSupported;
    }

    public boolean isRxStaggeredSoundingSupported() {
        return this.rxStaggeredSoundingSupported;
    }

    public boolean isShortGiFor20MhzSupported() {
        return this.shortGiFor20MhzSupported;
    }

    public boolean isShortGiFor40MhzSupported() {
        return this.shortGiFor40MhzSupported;
    }

    public boolean isTxMcsSetDefined() {
        return this.txMcsSetDefined;
    }

    public boolean isTxNdpSupported() {
        return this.txNdpSupported;
    }

    public boolean isTxRxMcsSetNotEqual() {
        return this.txRxMcsSetNotEqual;
    }

    public boolean isTxSoundingPpdusSupported() {
        return this.txSoundingPpdusSupported;
    }

    public boolean isTxStaggeredSoundingSupported() {
        return this.txStaggeredSoundingSupported;
    }

    public boolean isTxStbcSupported() {
        return this.txStbcSupported;
    }

    public boolean isTxUnequalModulationSupported() {
        return this.txUnequalModulationSupported;
    }

    public boolean islSigTxopProtectionSupported() {
        return this.lSigTxopProtectionSupported;
    }

    @Override // org.pcap4j.packet.Dot11InformationElement
    public int length() {
        return 28;
    }

    public String toString() {
        return toString("");
    }

    private Dot11HTCapabilitiesElement(byte[] bArr, int i, int i2) throws IllegalRawDataException {
        super(bArr, i, i2, Dot11InformationElementId.HT_CAPABILITIES);
        if (getLengthAsInt() != 26) {
            throw new IllegalRawDataException("The length must be 26 but is actually: " + getLengthAsInt());
        }
        byte b = bArr[i + 2];
        this.ldpcCodingSupported = (b & 1) != 0;
        this.both20and40MhzSupported = (b & 2) != 0;
        this.smPowerSaveMode = SmPowerSaveMode.getInstance((b >> 2) & 3);
        this.htGreenfieldSupported = (b & 16) != 0;
        this.shortGiFor20MhzSupported = (b & 32) != 0;
        this.shortGiFor40MhzSupported = (b & 64) != 0;
        this.txStbcSupported = (b & 128) != 0;
        byte b2 = bArr[i + 3];
        this.rxStbcSupport = StbcSupport.getInstance(b2 & 3);
        this.htDelayedBlockAckSupported = (b2 & 4) != 0;
        this.maxAMsduLength = AMsduLength.getInstance((b2 >> 3) & 1);
        this.dsssCckModeIn40MhzSupported = (b2 & 16) != 0;
        this.bit13OfHtCapabilitiesInfo = (b2 & 32) != 0;
        this.fortyMhzIntolerant = (b2 & 64) != 0;
        this.lSigTxopProtectionSupported = (b2 & 128) != 0;
        byte b3 = bArr[i + 4];
        this.maxAMpduLength = AMpduLength.getInstance(b3 & 3);
        this.minMpduStartSpacing = MpduStartSpacing.getInstance((b3 >> 2) & 7);
        this.bit5OfAMpduParameters = (b3 & 32) != 0;
        this.bit6OfAMpduParameters = (b3 & 64) != 0;
        this.bit7OfAMpduParameters = (b3 & 128) != 0;
        this.supportedRxMcsIndexes = new boolean[77];
        for (int i3 = 0; i3 < 9; i3++) {
            byte b4 = bArr[i + 5 + i3];
            int i4 = i3 * 8;
            for (int i5 = 0; i5 < 8; i5++) {
                this.supportedRxMcsIndexes[i4 + i5] = (b4 & 1) != 0;
                b4 = (byte) (b4 >> 1);
            }
        }
        byte b5 = bArr[i + 14];
        for (int i6 = 0; i6 < 5; i6++) {
            this.supportedRxMcsIndexes[i6 + 72] = (b5 & 1) != 0;
            b5 = (byte) (b5 >> 1);
        }
        this.bit77OfSupportedMcsSet = (b5 & 1) != 0;
        this.bit78OfSupportedMcsSet = (b5 & 2) != 0;
        this.bit79OfSupportedMcsSet = (b5 & 4) != 0;
        byte b6 = bArr[i + 16];
        this.rxHighestSupportedDataRate = (short) ((bArr[i + 15] | (b6 << 8)) & 1023);
        this.bit90OfSupportedMcsSet = (b6 & 4) != 0;
        this.bit91OfSupportedMcsSet = (b6 & 8) != 0;
        this.bit92OfSupportedMcsSet = (b6 & 16) != 0;
        this.bit93OfSupportedMcsSet = (b6 & 32) != 0;
        this.bit94OfSupportedMcsSet = (b6 & 64) != 0;
        this.bit95OfSupportedMcsSet = (b6 & 128) != 0;
        byte b7 = bArr[i + 17];
        this.txMcsSetDefined = (b7 & 1) != 0;
        this.txRxMcsSetNotEqual = (b7 & 2) != 0;
        this.txMaxNumSpatialStreamsSupported = NumSpatialStreams.getInstance((b7 >> 2) & 3);
        this.txUnequalModulationSupported = (b7 & 16) != 0;
        this.bit101OfSupportedMcsSet = (b7 & 32) != 0;
        this.bit102OfSupportedMcsSet = (b7 & 64) != 0;
        this.bit103OfSupportedMcsSet = (b7 & 128) != 0;
        byte b8 = bArr[i + 18];
        this.bit104OfSupportedMcsSet = (b8 & 1) != 0;
        this.bit105OfSupportedMcsSet = (b8 & 2) != 0;
        this.bit106OfSupportedMcsSet = (b8 & 4) != 0;
        this.bit107OfSupportedMcsSet = (b8 & 8) != 0;
        this.bit108OfSupportedMcsSet = (b8 & 16) != 0;
        this.bit109OfSupportedMcsSet = (b8 & 32) != 0;
        this.bit110OfSupportedMcsSet = (b8 & 64) != 0;
        this.bit111OfSupportedMcsSet = (b8 & 128) != 0;
        byte b9 = bArr[i + 19];
        this.bit112OfSupportedMcsSet = (b9 & 1) != 0;
        this.bit113OfSupportedMcsSet = (b9 & 2) != 0;
        this.bit114OfSupportedMcsSet = (b9 & 4) != 0;
        this.bit115OfSupportedMcsSet = (b9 & 8) != 0;
        this.bit116OfSupportedMcsSet = (b9 & 16) != 0;
        this.bit117OfSupportedMcsSet = (b9 & 32) != 0;
        this.bit118OfSupportedMcsSet = (b9 & 64) != 0;
        this.bit119OfSupportedMcsSet = (b9 & 128) != 0;
        byte b10 = bArr[i + 20];
        this.bit120OfSupportedMcsSet = (b10 & 1) != 0;
        this.bit121OfSupportedMcsSet = (b10 & 2) != 0;
        this.bit122OfSupportedMcsSet = (b10 & 4) != 0;
        this.bit123OfSupportedMcsSet = (b10 & 8) != 0;
        this.bit124OfSupportedMcsSet = (b10 & 16) != 0;
        this.bit125OfSupportedMcsSet = (b10 & 32) != 0;
        this.bit126OfSupportedMcsSet = (b10 & 64) != 0;
        this.bit127OfSupportedMcsSet = (b10 & 128) != 0;
        byte b11 = bArr[i + 21];
        this.pcoSupported = (b11 & 1) != 0;
        this.pcoTransitionTime = PcoTransitionTime.getInstance((b11 >> 1) & 3);
        this.bit3OfHtExtendedCapabilities = (b11 & 8) != 0;
        this.bit4OfHtExtendedCapabilities = (b11 & 16) != 0;
        this.bit5OfHtExtendedCapabilities = (b11 & 32) != 0;
        this.bit6OfHtExtendedCapabilities = (b11 & 64) != 0;
        this.bit7OfHtExtendedCapabilities = (b11 & 128) != 0;
        byte b12 = bArr[i + 22];
        this.mcsFeedbackCapability = McsFeedbackCapability.getInstance(b12 & 3);
        this.htControlFieldSupported = (b12 & 4) != 0;
        this.rdResponderSupported = (b12 & 8) != 0;
        this.bit12OfHtExtendedCapabilities = (b12 & 16) != 0;
        this.bit13OfHtExtendedCapabilities = (b12 & 32) != 0;
        this.bit14OfHtExtendedCapabilities = (b12 & 64) != 0;
        this.bit15OfHtExtendedCapabilities = (b12 & 128) != 0;
        byte b13 = bArr[i + 23];
        this.implicitTxBeamformingReceivingSupported = (b13 & 1) != 0;
        this.rxStaggeredSoundingSupported = (b13 & 2) != 0;
        this.txStaggeredSoundingSupported = (b13 & 4) != 0;
        this.rxNdpSupported = (b13 & 8) != 0;
        this.txNdpSupported = (b13 & 16) != 0;
        this.implicitTxBeamformingSupported = (b13 & 32) != 0;
        this.calibration = Calibration.getInstance((b13 >> 6) & 3);
        int i7 = ByteArrays.getInt(bArr, i + 24, ByteOrder.LITTLE_ENDIAN);
        this.explicitCsiTxBeamformingSupported = (i7 & 1) != 0;
        this.explicitNoncompressedSteeringSupported = (i7 & 2) != 0;
        this.explicitCompressedSteeringSupported = (i7 & 4) != 0;
        this.explicitTxBeamformingCsiFeedbackCapability = BeamformingFeedbackCapability.getInstance((i7 >> 3) & 3);
        this.explicitNoncompressedBeamformingFeedbackCapability = BeamformingFeedbackCapability.getInstance((i7 >> 5) & 3);
        this.explicitCompressedBeamformingFeedbackCapability = BeamformingFeedbackCapability.getInstance((i7 >> 7) & 3);
        this.minGrouping = Grouping.getInstance((i7 >> 9) & 3);
        this.csiNumBeamformerAntennasSupported = NumBeamformerAntennas.getInstance((i7 >> 11) & 3);
        this.noncompressedSteeringNumBeamformerAntennasSupported = NumBeamformerAntennas.getInstance((i7 >> 13) & 3);
        this.compressedSteeringNumBeamformerAntennasSupported = NumBeamformerAntennas.getInstance((i7 >> 15) & 3);
        this.csiMaxNumRowsBeamformerSupported = CsiNumRows.getInstance((i7 >> 17) & 3);
        this.channelEstimationCapability = ChannelEstimationCapability.getInstance((i7 >> 19) & 3);
        this.bit29OfTransmitBeamformingCapabilities = (2097152 & i7) != 0;
        this.bit30OfTransmitBeamformingCapabilities = (4194304 & i7) != 0;
        this.bit31OfTransmitBeamformingCapabilities = (8388608 & i7) != 0;
        this.antennaSelectionSupported = (16777216 & i7) != 0;
        this.explicitCsiFeedbackBasedTxAselSupported = (33554432 & i7) != 0;
        this.antennaIndicesFeedbackBasedTxAselSupported = (67108864 & i7) != 0;
        this.explicitCsiFeedbackSupported = (134217728 & i7) != 0;
        this.antennaIndicesFeedbackSupported = (268435456 & i7) != 0;
        this.rxAselSupported = (536870912 & i7) != 0;
        this.txSoundingPpdusSupported = (1073741824 & i7) != 0;
        this.bit7OfAselCapability = (i7 & Integer.MIN_VALUE) != 0;
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        String strZ = o40.z("line.separator", str, "HT Capabilities:", str, sb);
        sb.append("  Element ID: ");
        sb.append(getElementId());
        sb.append(strZ);
        sb.append(str);
        sb.append("  Length: ");
        sb.append(getLengthAsInt());
        sb.append(" bytes");
        sb.append(strZ);
        o40.I(str, "  HT Capabilities Info:", strZ, str, sb);
        sb.append("    LDPC Coding is Supported: ");
        t61.z(sb, this.ldpcCodingSupported, strZ, str, "    Supported Channel Width Set: ");
        o40.I(this.both20and40MhzSupported ? "20 MHz and 40 MHz" : "20 MHz", strZ, str, "    SM Power Save: ", sb);
        sb.append(this.smPowerSaveMode);
        sb.append(strZ);
        sb.append(str);
        sb.append("    HT-Greenfield is Supported: ");
        t61.z(sb, this.htGreenfieldSupported, strZ, str, "    Short GI for 20 MHz is Supported: ");
        t61.z(sb, this.shortGiFor20MhzSupported, strZ, str, "    Short GI for 40 MHz is Supported: ");
        t61.z(sb, this.shortGiFor40MhzSupported, strZ, str, "    Tx STBC is Supported: ");
        t61.z(sb, this.txStbcSupported, strZ, str, "    Rx STBC Support: ");
        sb.append(this.rxStbcSupport);
        sb.append(strZ);
        sb.append(str);
        sb.append("    HT-Delayed Block Ack is Supported: ");
        t61.z(sb, this.htDelayedBlockAckSupported, strZ, str, "    Max A-MSDU Length: ");
        sb.append(this.maxAMsduLength);
        sb.append(" octets");
        sb.append(strZ);
        sb.append(str);
        sb.append("    DSSS/CCK Mode in 40 MHz is Supported: ");
        t61.z(sb, this.dsssCckModeIn40MhzSupported, strZ, str, "    Bit 13: ");
        t61.z(sb, this.bit13OfHtCapabilitiesInfo, strZ, str, "    40 MHz is Intolerant: ");
        t61.z(sb, this.fortyMhzIntolerant, strZ, str, "    L-SIG TXOP Protection is Supported: ");
        t61.z(sb, this.lSigTxopProtectionSupported, strZ, str, "  A-MPDU Parameters:");
        t61.y(sb, strZ, str, "    Max A-MPDU Length: ");
        sb.append(this.maxAMpduLength);
        sb.append(" octets");
        sb.append(strZ);
        sb.append(str);
        sb.append("    Min MPDU Start Spacing: ");
        sb.append(this.minMpduStartSpacing);
        sb.append(strZ);
        sb.append(str);
        sb.append("    Bit 5: ");
        t61.z(sb, this.bit5OfAMpduParameters, strZ, str, "    Bit 6: ");
        t61.z(sb, this.bit6OfAMpduParameters, strZ, str, "    Bit 7: ");
        t61.z(sb, this.bit7OfAMpduParameters, strZ, str, "  Supported MCS Set:");
        t61.y(sb, strZ, str, "    Supported Rx MCS Indexes: ");
        boolean z = true;
        int i = 0;
        while (true) {
            boolean[] zArr = this.supportedRxMcsIndexes;
            if (i >= zArr.length) {
                t61.y(sb, strZ, str, "    Bit 77: ");
                t61.z(sb, this.bit77OfSupportedMcsSet, strZ, str, "    Bit 78: ");
                t61.z(sb, this.bit78OfSupportedMcsSet, strZ, str, "    Bit 79: ");
                t61.z(sb, this.bit79OfSupportedMcsSet, strZ, str, "    Rx Highest Supported Data Rate: ");
                sb.append((int) this.rxHighestSupportedDataRate);
                sb.append(" Mb/s");
                sb.append(strZ);
                sb.append(str);
                sb.append("    Bit 90: ");
                t61.z(sb, this.bit90OfSupportedMcsSet, strZ, str, "    Bit 91: ");
                t61.z(sb, this.bit91OfSupportedMcsSet, strZ, str, "    Bit 92: ");
                t61.z(sb, this.bit92OfSupportedMcsSet, strZ, str, "    Bit 93: ");
                t61.z(sb, this.bit93OfSupportedMcsSet, strZ, str, "    Bit 94: ");
                t61.z(sb, this.bit94OfSupportedMcsSet, strZ, str, "    Bit 95: ");
                t61.z(sb, this.bit95OfSupportedMcsSet, strZ, str, "    Tx MCS Set is Defined: ");
                t61.z(sb, this.txMcsSetDefined, strZ, str, "    Tx Rx MCS Set Not Equal: ");
                t61.z(sb, this.txRxMcsSetNotEqual, strZ, str, "    Tx Max Number Spatial Streams Supported: ");
                sb.append(this.txMaxNumSpatialStreamsSupported);
                sb.append(strZ);
                sb.append(str);
                sb.append("    Tx Unequal Modulation is Supported: ");
                t61.z(sb, this.txUnequalModulationSupported, strZ, str, "    Bit 101: ");
                t61.z(sb, this.bit101OfSupportedMcsSet, strZ, str, "    Bit 102: ");
                t61.z(sb, this.bit102OfSupportedMcsSet, strZ, str, "    Bit 103: ");
                t61.z(sb, this.bit103OfSupportedMcsSet, strZ, str, "    Bit 104: ");
                t61.z(sb, this.bit104OfSupportedMcsSet, strZ, str, "    Bit 105: ");
                t61.z(sb, this.bit105OfSupportedMcsSet, strZ, str, "    Bit 106: ");
                t61.z(sb, this.bit106OfSupportedMcsSet, strZ, str, "    Bit 107: ");
                t61.z(sb, this.bit107OfSupportedMcsSet, strZ, str, "    Bit 108: ");
                t61.z(sb, this.bit108OfSupportedMcsSet, strZ, str, "    Bit 109: ");
                t61.z(sb, this.bit109OfSupportedMcsSet, strZ, str, "    Bit 110: ");
                t61.z(sb, this.bit110OfSupportedMcsSet, strZ, str, "    Bit 111: ");
                t61.z(sb, this.bit111OfSupportedMcsSet, strZ, str, "    Bit 112: ");
                t61.z(sb, this.bit112OfSupportedMcsSet, strZ, str, "    Bit 113: ");
                t61.z(sb, this.bit113OfSupportedMcsSet, strZ, str, "    Bit 114: ");
                t61.z(sb, this.bit114OfSupportedMcsSet, strZ, str, "    Bit 115: ");
                t61.z(sb, this.bit115OfSupportedMcsSet, strZ, str, "    Bit 116: ");
                t61.z(sb, this.bit116OfSupportedMcsSet, strZ, str, "    Bit 117: ");
                t61.z(sb, this.bit117OfSupportedMcsSet, strZ, str, "    Bit 118: ");
                t61.z(sb, this.bit118OfSupportedMcsSet, strZ, str, "    Bit 119: ");
                t61.z(sb, this.bit119OfSupportedMcsSet, strZ, str, "    Bit 120: ");
                t61.z(sb, this.bit120OfSupportedMcsSet, strZ, str, "    Bit 121: ");
                t61.z(sb, this.bit121OfSupportedMcsSet, strZ, str, "    Bit 122: ");
                t61.z(sb, this.bit122OfSupportedMcsSet, strZ, str, "    Bit 123: ");
                t61.z(sb, this.bit123OfSupportedMcsSet, strZ, str, "    Bit 124: ");
                t61.z(sb, this.bit124OfSupportedMcsSet, strZ, str, "    Bit 125: ");
                t61.z(sb, this.bit125OfSupportedMcsSet, strZ, str, "    Bit 126: ");
                t61.z(sb, this.bit126OfSupportedMcsSet, strZ, str, "    Bit 127: ");
                t61.z(sb, this.bit127OfSupportedMcsSet, strZ, str, "  HT Extended Capabilities:");
                t61.y(sb, strZ, str, "    PCO is Supported: ");
                t61.z(sb, this.pcoSupported, strZ, str, "    PCO Transition Time: ");
                sb.append(this.pcoTransitionTime);
                sb.append(strZ);
                sb.append(str);
                sb.append("    Bit 3: ");
                t61.z(sb, this.bit3OfHtExtendedCapabilities, strZ, str, "    Bit 4: ");
                t61.z(sb, this.bit4OfHtExtendedCapabilities, strZ, str, "    Bit 5: ");
                t61.z(sb, this.bit5OfHtExtendedCapabilities, strZ, str, "    Bit 6: ");
                t61.z(sb, this.bit6OfHtExtendedCapabilities, strZ, str, "    Bit 7: ");
                t61.z(sb, this.bit7OfHtExtendedCapabilities, strZ, str, "    MCS Feedback: ");
                sb.append(this.mcsFeedbackCapability);
                sb.append(strZ);
                sb.append(str);
                sb.append("    HT Control Field is Support: ");
                t61.z(sb, this.htControlFieldSupported, strZ, str, "    RD Responder is Supported: ");
                t61.z(sb, this.rdResponderSupported, strZ, str, "    Bit 12: ");
                t61.z(sb, this.bit12OfHtExtendedCapabilities, strZ, str, "    Bit 13: ");
                t61.z(sb, this.bit13OfHtExtendedCapabilities, strZ, str, "    Bit 14: ");
                t61.z(sb, this.bit14OfHtExtendedCapabilities, strZ, str, "    Bit 15: ");
                t61.z(sb, this.bit15OfHtExtendedCapabilities, strZ, str, "  Transmit Beamforming Capabilities:");
                t61.y(sb, strZ, str, "    Implicit Tx Beamforming Receiving is Supported: ");
                t61.z(sb, this.implicitTxBeamformingReceivingSupported, strZ, str, "    Rx Staggered Sounding is Supported: ");
                t61.z(sb, this.rxStaggeredSoundingSupported, strZ, str, "    Tx Staggered Sounding is Supported: ");
                t61.z(sb, this.txStaggeredSoundingSupported, strZ, str, "    Rx NDP is Supported: ");
                t61.z(sb, this.rxNdpSupported, strZ, str, "    Tx NDP is Supported: ");
                t61.z(sb, this.txNdpSupported, strZ, str, "    Implicit Tx Beamforming is Supported: ");
                t61.z(sb, this.implicitTxBeamformingSupported, strZ, str, "    Calibration: ");
                sb.append(this.calibration);
                sb.append(strZ);
                sb.append(str);
                sb.append("    Explicit CSI Tx Beamforming is Supported: ");
                t61.z(sb, this.explicitCsiTxBeamformingSupported, strZ, str, "    Explicit Noncompressed Steering is Supported: ");
                t61.z(sb, this.explicitNoncompressedSteeringSupported, strZ, str, "    Explicit Compressed Steering is Supported: ");
                t61.z(sb, this.explicitCompressedSteeringSupported, strZ, str, "    Explicit Tx Beamforming CSI Feedback: ");
                sb.append(this.explicitTxBeamformingCsiFeedbackCapability);
                sb.append(strZ);
                sb.append(str);
                sb.append("    Explicit Noncompressed Beamforming Feedback: ");
                sb.append(this.explicitNoncompressedBeamformingFeedbackCapability);
                sb.append(strZ);
                sb.append(str);
                sb.append("    Explicit Compressed Beamforming Feedback: ");
                sb.append(this.explicitCompressedBeamformingFeedbackCapability);
                sb.append(strZ);
                sb.append(str);
                sb.append("    Min Grouping: ");
                sb.append(this.minGrouping);
                sb.append(strZ);
                sb.append(str);
                sb.append("    CSI Number of Beamformer Antennas Supported: ");
                sb.append(this.csiNumBeamformerAntennasSupported);
                sb.append(strZ);
                sb.append(str);
                sb.append("    Noncompressed Steering Number of Beamformer Antennas Supported: ");
                sb.append(this.noncompressedSteeringNumBeamformerAntennasSupported);
                sb.append(strZ);
                sb.append(str);
                sb.append("    Compressed Steering Number of Beamformer Antennas Supported: ");
                sb.append(this.compressedSteeringNumBeamformerAntennasSupported);
                sb.append(strZ);
                sb.append(str);
                sb.append("    CSI Max Number of Rows Beamformer Supported: ");
                sb.append(this.csiMaxNumRowsBeamformerSupported);
                sb.append(strZ);
                sb.append(str);
                sb.append("    Channel Estimation: ");
                sb.append(this.channelEstimationCapability);
                sb.append(strZ);
                sb.append(str);
                sb.append("    Bit 29: ");
                t61.z(sb, this.bit29OfTransmitBeamformingCapabilities, strZ, str, "    Bit 30: ");
                t61.z(sb, this.bit30OfTransmitBeamformingCapabilities, strZ, str, "    Bit 31: ");
                t61.z(sb, this.bit31OfTransmitBeamformingCapabilities, strZ, str, "  ASEL Capabilities:");
                t61.y(sb, strZ, str, "    Antenna Selection is Supported: ");
                t61.z(sb, this.antennaSelectionSupported, strZ, str, "    Explicit CSI Feedback Based Tx ASEL is Supported: ");
                t61.z(sb, this.explicitCsiFeedbackBasedTxAselSupported, strZ, str, "    Antenna Indices Feedback Based Tx ASEL is Supported: ");
                t61.z(sb, this.antennaIndicesFeedbackBasedTxAselSupported, strZ, str, "    Explicit CSI Feedback is Supported: ");
                t61.z(sb, this.explicitCsiFeedbackSupported, strZ, str, "    Antenna Indices Feedback is Supported: ");
                t61.z(sb, this.antennaIndicesFeedbackSupported, strZ, str, "    Rx ASEL is Supported: ");
                t61.z(sb, this.rxAselSupported, strZ, str, "    Tx Sounding PPDUs is Supported: ");
                t61.z(sb, this.txSoundingPpdusSupported, strZ, str, "    Bit 7: ");
                return t61.l(sb, this.bit7OfAselCapability, strZ);
            }
            if (zArr[i]) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(i);
            }
            i++;
        }
    }

    private Dot11HTCapabilitiesElement(Builder builder) {
        super(builder);
        if (builder != null && builder.smPowerSaveMode != null && builder.rxStbcSupport != null && builder.maxAMsduLength != null && builder.maxAMpduLength != null && builder.minMpduStartSpacing != null && builder.supportedRxMcsIndexes != null && builder.txMaxNumSpatialStreamsSupported != null && builder.pcoTransitionTime != null && builder.mcsFeedbackCapability != null && builder.calibration != null && builder.explicitTxBeamformingCsiFeedbackCapability != null && builder.explicitNoncompressedBeamformingFeedbackCapability != null && builder.explicitCompressedBeamformingFeedbackCapability != null && builder.minGrouping != null && builder.csiNumBeamformerAntennasSupported != null && builder.noncompressedSteeringNumBeamformerAntennasSupported != null && builder.compressedSteeringNumBeamformerAntennasSupported != null && builder.csiMaxNumRowsBeamformerSupported != null && builder.channelEstimationCapability != null) {
            if (builder.supportedRxMcsIndexes.length == 77) {
                if ((builder.rxHighestSupportedDataRate & 64512) == 0) {
                    this.ldpcCodingSupported = builder.ldpcCodingSupported;
                    this.both20and40MhzSupported = builder.both20and40MhzSupported;
                    this.smPowerSaveMode = builder.smPowerSaveMode;
                    this.htGreenfieldSupported = builder.htGreenfieldSupported;
                    this.shortGiFor20MhzSupported = builder.shortGiFor20MhzSupported;
                    this.shortGiFor40MhzSupported = builder.shortGiFor40MhzSupported;
                    this.txStbcSupported = builder.txStbcSupported;
                    this.rxStbcSupport = builder.rxStbcSupport;
                    this.htDelayedBlockAckSupported = builder.htDelayedBlockAckSupported;
                    this.maxAMsduLength = builder.maxAMsduLength;
                    this.dsssCckModeIn40MhzSupported = builder.dsssCckModeIn40MhzSupported;
                    this.bit13OfHtCapabilitiesInfo = builder.bit13OfHtCapabilitiesInfo;
                    this.fortyMhzIntolerant = builder.fortyMhzIntolerant;
                    this.lSigTxopProtectionSupported = builder.lSigTxopProtectionSupported;
                    this.maxAMpduLength = builder.maxAMpduLength;
                    this.minMpduStartSpacing = builder.minMpduStartSpacing;
                    this.bit5OfAMpduParameters = builder.bit5OfAMpduParameters;
                    this.bit6OfAMpduParameters = builder.bit6OfAMpduParameters;
                    this.bit7OfAMpduParameters = builder.bit7OfAMpduParameters;
                    this.supportedRxMcsIndexes = builder.supportedRxMcsIndexes;
                    this.bit77OfSupportedMcsSet = builder.bit77OfSupportedMcsSet;
                    this.bit78OfSupportedMcsSet = builder.bit78OfSupportedMcsSet;
                    this.bit79OfSupportedMcsSet = builder.bit79OfSupportedMcsSet;
                    this.rxHighestSupportedDataRate = builder.rxHighestSupportedDataRate;
                    this.bit90OfSupportedMcsSet = builder.bit90OfSupportedMcsSet;
                    this.bit91OfSupportedMcsSet = builder.bit91OfSupportedMcsSet;
                    this.bit92OfSupportedMcsSet = builder.bit92OfSupportedMcsSet;
                    this.bit93OfSupportedMcsSet = builder.bit93OfSupportedMcsSet;
                    this.bit94OfSupportedMcsSet = builder.bit94OfSupportedMcsSet;
                    this.bit95OfSupportedMcsSet = builder.bit95OfSupportedMcsSet;
                    this.txMcsSetDefined = builder.txMcsSetDefined;
                    this.txRxMcsSetNotEqual = builder.txRxMcsSetNotEqual;
                    this.txMaxNumSpatialStreamsSupported = builder.txMaxNumSpatialStreamsSupported;
                    this.txUnequalModulationSupported = builder.txUnequalModulationSupported;
                    this.bit101OfSupportedMcsSet = builder.bit101OfSupportedMcsSet;
                    this.bit102OfSupportedMcsSet = builder.bit102OfSupportedMcsSet;
                    this.bit103OfSupportedMcsSet = builder.bit103OfSupportedMcsSet;
                    this.bit104OfSupportedMcsSet = builder.bit104OfSupportedMcsSet;
                    this.bit105OfSupportedMcsSet = builder.bit105OfSupportedMcsSet;
                    this.bit106OfSupportedMcsSet = builder.bit106OfSupportedMcsSet;
                    this.bit107OfSupportedMcsSet = builder.bit107OfSupportedMcsSet;
                    this.bit108OfSupportedMcsSet = builder.bit108OfSupportedMcsSet;
                    this.bit109OfSupportedMcsSet = builder.bit109OfSupportedMcsSet;
                    this.bit110OfSupportedMcsSet = builder.bit110OfSupportedMcsSet;
                    this.bit111OfSupportedMcsSet = builder.bit111OfSupportedMcsSet;
                    this.bit112OfSupportedMcsSet = builder.bit112OfSupportedMcsSet;
                    this.bit113OfSupportedMcsSet = builder.bit113OfSupportedMcsSet;
                    this.bit114OfSupportedMcsSet = builder.bit114OfSupportedMcsSet;
                    this.bit115OfSupportedMcsSet = builder.bit115OfSupportedMcsSet;
                    this.bit116OfSupportedMcsSet = builder.bit116OfSupportedMcsSet;
                    this.bit117OfSupportedMcsSet = builder.bit117OfSupportedMcsSet;
                    this.bit118OfSupportedMcsSet = builder.bit118OfSupportedMcsSet;
                    this.bit119OfSupportedMcsSet = builder.bit119OfSupportedMcsSet;
                    this.bit120OfSupportedMcsSet = builder.bit120OfSupportedMcsSet;
                    this.bit121OfSupportedMcsSet = builder.bit121OfSupportedMcsSet;
                    this.bit122OfSupportedMcsSet = builder.bit122OfSupportedMcsSet;
                    this.bit123OfSupportedMcsSet = builder.bit123OfSupportedMcsSet;
                    this.bit124OfSupportedMcsSet = builder.bit124OfSupportedMcsSet;
                    this.bit125OfSupportedMcsSet = builder.bit125OfSupportedMcsSet;
                    this.bit126OfSupportedMcsSet = builder.bit126OfSupportedMcsSet;
                    this.bit127OfSupportedMcsSet = builder.bit127OfSupportedMcsSet;
                    this.pcoSupported = builder.pcoSupported;
                    this.pcoTransitionTime = builder.pcoTransitionTime;
                    this.bit3OfHtExtendedCapabilities = builder.bit3OfHtExtendedCapabilities;
                    this.bit4OfHtExtendedCapabilities = builder.bit4OfHtExtendedCapabilities;
                    this.bit5OfHtExtendedCapabilities = builder.bit5OfHtExtendedCapabilities;
                    this.bit6OfHtExtendedCapabilities = builder.bit6OfHtExtendedCapabilities;
                    this.bit7OfHtExtendedCapabilities = builder.bit7OfHtExtendedCapabilities;
                    this.mcsFeedbackCapability = builder.mcsFeedbackCapability;
                    this.htControlFieldSupported = builder.htControlFieldSupported;
                    this.rdResponderSupported = builder.rdResponderSupported;
                    this.bit12OfHtExtendedCapabilities = builder.bit12OfHtExtendedCapabilities;
                    this.bit13OfHtExtendedCapabilities = builder.bit13OfHtExtendedCapabilities;
                    this.bit14OfHtExtendedCapabilities = builder.bit14OfHtExtendedCapabilities;
                    this.bit15OfHtExtendedCapabilities = builder.bit15OfHtExtendedCapabilities;
                    this.implicitTxBeamformingReceivingSupported = builder.implicitTxBeamformingReceivingSupported;
                    this.rxStaggeredSoundingSupported = builder.rxStaggeredSoundingSupported;
                    this.txStaggeredSoundingSupported = builder.txStaggeredSoundingSupported;
                    this.rxNdpSupported = builder.rxNdpSupported;
                    this.txNdpSupported = builder.txNdpSupported;
                    this.implicitTxBeamformingSupported = builder.implicitTxBeamformingSupported;
                    this.calibration = builder.calibration;
                    this.explicitCsiTxBeamformingSupported = builder.explicitCsiTxBeamformingSupported;
                    this.explicitNoncompressedSteeringSupported = builder.explicitNoncompressedSteeringSupported;
                    this.explicitCompressedSteeringSupported = builder.explicitCompressedSteeringSupported;
                    this.explicitTxBeamformingCsiFeedbackCapability = builder.explicitTxBeamformingCsiFeedbackCapability;
                    this.explicitNoncompressedBeamformingFeedbackCapability = builder.explicitNoncompressedBeamformingFeedbackCapability;
                    this.explicitCompressedBeamformingFeedbackCapability = builder.explicitCompressedBeamformingFeedbackCapability;
                    this.minGrouping = builder.minGrouping;
                    this.csiNumBeamformerAntennasSupported = builder.csiNumBeamformerAntennasSupported;
                    this.noncompressedSteeringNumBeamformerAntennasSupported = builder.noncompressedSteeringNumBeamformerAntennasSupported;
                    this.compressedSteeringNumBeamformerAntennasSupported = builder.compressedSteeringNumBeamformerAntennasSupported;
                    this.csiMaxNumRowsBeamformerSupported = builder.csiMaxNumRowsBeamformerSupported;
                    this.channelEstimationCapability = builder.channelEstimationCapability;
                    this.bit29OfTransmitBeamformingCapabilities = builder.bit29OfTransmitBeamformingCapabilities;
                    this.bit30OfTransmitBeamformingCapabilities = builder.bit30OfTransmitBeamformingCapabilities;
                    this.bit31OfTransmitBeamformingCapabilities = builder.bit31OfTransmitBeamformingCapabilities;
                    this.antennaSelectionSupported = builder.antennaSelectionSupported;
                    this.explicitCsiFeedbackBasedTxAselSupported = builder.explicitCsiFeedbackBasedTxAselSupported;
                    this.antennaIndicesFeedbackBasedTxAselSupported = builder.antennaIndicesFeedbackBasedTxAselSupported;
                    this.explicitCsiFeedbackSupported = builder.explicitCsiFeedbackSupported;
                    this.antennaIndicesFeedbackSupported = builder.antennaIndicesFeedbackSupported;
                    this.rxAselSupported = builder.rxAselSupported;
                    this.txSoundingPpdusSupported = builder.txSoundingPpdusSupported;
                    this.bit7OfAselCapability = builder.bit7OfAselCapability;
                    return;
                }
                throw new IllegalArgumentException("(rxHighestSupportedDataRate & 0xFC00) must be zero. builder.rxHighestSupportedDataRate: " + ((int) builder.rxHighestSupportedDataRate));
            }
            throw new IllegalArgumentException("supportedRxMcsIndexes.length must be 77. builder.supportedRxMcsIndexes.length: " + builder.supportedRxMcsIndexes.length);
        }
        throw new NullPointerException("builder: " + builder + " builder.smPowerSaveMode: " + builder.smPowerSaveMode + " builder.rxStbcSupport: " + builder.rxStbcSupport + " builder.maxAMsduLength: " + builder.maxAMsduLength + " builder.maxAMpduLength: " + builder.maxAMpduLength + " builder.minMpduStartSpacing: " + builder.minMpduStartSpacing + " builder.supportedRxMcsIndexes: " + builder.supportedRxMcsIndexes + " builder.txMaxNumSpatialStreamsSupported: " + builder.txMaxNumSpatialStreamsSupported + " builder.pcoTransitionTime: " + builder.pcoTransitionTime + " builder.mcsFeedbackCapability: " + builder.mcsFeedbackCapability + " builder.calibration: " + builder.calibration + " builder.explicitTxBeamformingCsiFeedbackCapability: " + builder.explicitTxBeamformingCsiFeedbackCapability + " builder.explicitNoncompressedBeamformingFeedbackCapability: " + builder.explicitNoncompressedBeamformingFeedbackCapability + " builder.explicitCompressedBeamformingFeedbackCapability: " + builder.explicitCompressedBeamformingFeedbackCapability + " builder.minGrouping: " + builder.minGrouping + " builder.csiNumBeamformerAntennasSupported: " + builder.csiNumBeamformerAntennasSupported + " builder.noncompressedSteeringNumBeamformerAntennasSupported: " + builder.noncompressedSteeringNumBeamformerAntennasSupported + " builder.compressedSteeringNumBeamformerAntennasSupported: " + builder.compressedSteeringNumBeamformerAntennasSupported + " builder.csiMaxNumRowsBeamformerSupported: " + builder.csiMaxNumRowsBeamformerSupported + " builder.channelEstimationCapability: " + builder.channelEstimationCapability);
    }
}
