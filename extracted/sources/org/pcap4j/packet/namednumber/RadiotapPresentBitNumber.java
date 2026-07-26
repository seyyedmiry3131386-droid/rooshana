package org.pcap4j.packet.namednumber;

import ir.mservices.market.app.detail.data.SummaryDto;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class RadiotapPresentBitNumber extends NamedNumber<Integer, RadiotapPresentBitNumber> {
    public static final int ANOTHER_BITMAP_FOLLOWS = 31;
    public static final RadiotapPresentBitNumber ANTENNA;
    public static final RadiotapPresentBitNumber ANTENNA_NOISE;
    public static final RadiotapPresentBitNumber ANTENNA_SIGNAL;
    public static final RadiotapPresentBitNumber A_MPDU_STATUS;
    public static final RadiotapPresentBitNumber CHANNEL;
    public static final RadiotapPresentBitNumber DBM_TX_POWER;
    public static final RadiotapPresentBitNumber DB_ANTENNA_NOISE;
    public static final RadiotapPresentBitNumber DB_ANTENNA_SIGNAL;
    public static final RadiotapPresentBitNumber DB_TX_ATTENUATION;
    public static final RadiotapPresentBitNumber FHSS;
    public static final RadiotapPresentBitNumber FLAGS;
    public static final RadiotapPresentBitNumber LOCK_QUALITY;
    public static final RadiotapPresentBitNumber MCS;
    public static final int RADIOTAP_NAMESPACE = 29;
    public static final RadiotapPresentBitNumber RATE;
    public static final RadiotapPresentBitNumber RX_FLAGS;
    public static final RadiotapPresentBitNumber TSFT;
    public static final RadiotapPresentBitNumber TX_ATTENUATION;
    public static final int VENDOR_NAMESPACE = 30;
    public static final RadiotapPresentBitNumber VHT;
    private static final Map<String, Map<Integer, RadiotapPresentBitNumber>> registry;
    private static final long serialVersionUID = -1778769702168080669L;
    private final String namespace;
    private final int requiredAlignment;

    static {
        RadiotapPresentBitNumber radiotapPresentBitNumber = new RadiotapPresentBitNumber(0, "TSFT", 8);
        TSFT = radiotapPresentBitNumber;
        RadiotapPresentBitNumber radiotapPresentBitNumber2 = new RadiotapPresentBitNumber(1, "Flags", 1);
        FLAGS = radiotapPresentBitNumber2;
        RadiotapPresentBitNumber radiotapPresentBitNumber3 = new RadiotapPresentBitNumber(2, SummaryDto.TYPE_RATE, 1);
        RATE = radiotapPresentBitNumber3;
        RadiotapPresentBitNumber radiotapPresentBitNumber4 = new RadiotapPresentBitNumber(3, "Channel", 2);
        CHANNEL = radiotapPresentBitNumber4;
        RadiotapPresentBitNumber radiotapPresentBitNumber5 = new RadiotapPresentBitNumber(4, "FHSS", 1);
        FHSS = radiotapPresentBitNumber5;
        RadiotapPresentBitNumber radiotapPresentBitNumber6 = new RadiotapPresentBitNumber(5, "Antenna signal", 1);
        ANTENNA_SIGNAL = radiotapPresentBitNumber6;
        RadiotapPresentBitNumber radiotapPresentBitNumber7 = new RadiotapPresentBitNumber(6, "Antenna noise", 1);
        ANTENNA_NOISE = radiotapPresentBitNumber7;
        RadiotapPresentBitNumber radiotapPresentBitNumber8 = new RadiotapPresentBitNumber(7, "Lock quality", 2);
        LOCK_QUALITY = radiotapPresentBitNumber8;
        RadiotapPresentBitNumber radiotapPresentBitNumber9 = new RadiotapPresentBitNumber(8, "TX attenuation", 2);
        TX_ATTENUATION = radiotapPresentBitNumber9;
        RadiotapPresentBitNumber radiotapPresentBitNumber10 = new RadiotapPresentBitNumber(9, "dB TX attenuation", 2);
        DB_TX_ATTENUATION = radiotapPresentBitNumber10;
        RadiotapPresentBitNumber radiotapPresentBitNumber11 = new RadiotapPresentBitNumber(10, "dBm TX power", 1);
        DBM_TX_POWER = radiotapPresentBitNumber11;
        RadiotapPresentBitNumber radiotapPresentBitNumber12 = new RadiotapPresentBitNumber(11, "Antenna", 1);
        ANTENNA = radiotapPresentBitNumber12;
        RadiotapPresentBitNumber radiotapPresentBitNumber13 = new RadiotapPresentBitNumber(12, "dB antenna signal", 1);
        DB_ANTENNA_SIGNAL = radiotapPresentBitNumber13;
        RadiotapPresentBitNumber radiotapPresentBitNumber14 = new RadiotapPresentBitNumber(13, "dB antenna noise", 1);
        DB_ANTENNA_NOISE = radiotapPresentBitNumber14;
        RadiotapPresentBitNumber radiotapPresentBitNumber15 = new RadiotapPresentBitNumber(14, "RX flags", 2);
        RX_FLAGS = radiotapPresentBitNumber15;
        RadiotapPresentBitNumber radiotapPresentBitNumber16 = new RadiotapPresentBitNumber(19, "MCS", 1);
        MCS = radiotapPresentBitNumber16;
        RadiotapPresentBitNumber radiotapPresentBitNumber17 = new RadiotapPresentBitNumber(20, "A-MPDU status", 4);
        A_MPDU_STATUS = radiotapPresentBitNumber17;
        RadiotapPresentBitNumber radiotapPresentBitNumber18 = new RadiotapPresentBitNumber(21, "VHT", 2);
        VHT = radiotapPresentBitNumber18;
        HashMap map = new HashMap();
        registry = map;
        HashMap map2 = new HashMap();
        map2.put(radiotapPresentBitNumber.value(), radiotapPresentBitNumber);
        map2.put(radiotapPresentBitNumber2.value(), radiotapPresentBitNumber2);
        map2.put(radiotapPresentBitNumber3.value(), radiotapPresentBitNumber3);
        map2.put(radiotapPresentBitNumber4.value(), radiotapPresentBitNumber4);
        map2.put(radiotapPresentBitNumber5.value(), radiotapPresentBitNumber5);
        map2.put(radiotapPresentBitNumber6.value(), radiotapPresentBitNumber6);
        map2.put(radiotapPresentBitNumber7.value(), radiotapPresentBitNumber7);
        map2.put(radiotapPresentBitNumber8.value(), radiotapPresentBitNumber8);
        map2.put(radiotapPresentBitNumber9.value(), radiotapPresentBitNumber9);
        map2.put(radiotapPresentBitNumber10.value(), radiotapPresentBitNumber10);
        map2.put(radiotapPresentBitNumber11.value(), radiotapPresentBitNumber11);
        map2.put(radiotapPresentBitNumber12.value(), radiotapPresentBitNumber12);
        map2.put(radiotapPresentBitNumber13.value(), radiotapPresentBitNumber13);
        map2.put(radiotapPresentBitNumber14.value(), radiotapPresentBitNumber14);
        map2.put(radiotapPresentBitNumber15.value(), radiotapPresentBitNumber15);
        map2.put(radiotapPresentBitNumber16.value(), radiotapPresentBitNumber16);
        map2.put(radiotapPresentBitNumber17.value(), radiotapPresentBitNumber17);
        map2.put(radiotapPresentBitNumber18.value(), radiotapPresentBitNumber18);
        map.put("", map2);
    }

    public RadiotapPresentBitNumber(Integer num, String str, int i) {
        this(num, str, "", i);
    }

    public static RadiotapPresentBitNumber getInstance(Integer num) {
        return getInstance(num, "");
    }

    public static RadiotapPresentBitNumber register(RadiotapPresentBitNumber radiotapPresentBitNumber) {
        String namespace = radiotapPresentBitNumber.getNamespace();
        Map<String, Map<Integer, RadiotapPresentBitNumber>> map = registry;
        Map<Integer, RadiotapPresentBitNumber> map2 = map.get(namespace);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(namespace, map2);
        }
        return map2.put(radiotapPresentBitNumber.value(), radiotapPresentBitNumber);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!RadiotapPresentBitNumber.class.isInstance(obj)) {
            return false;
        }
        RadiotapPresentBitNumber radiotapPresentBitNumber = (RadiotapPresentBitNumber) obj;
        return value().equals(radiotapPresentBitNumber.value()) && this.namespace.equals(radiotapPresentBitNumber.namespace);
    }

    public String getNamespace() {
        return this.namespace;
    }

    public int getRequiredAlignment() {
        return this.requiredAlignment;
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int hashCode() {
        return this.namespace.hashCode() + ((value().hashCode() + 31) * 31);
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public String valueAsString() {
        if (this.namespace.isEmpty()) {
            return String.valueOf(4294967295L & ((long) value().intValue()));
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append(this.namespace);
        sb.append("/");
        sb.append(4294967295L & ((long) value().intValue()));
        return sb.toString();
    }

    public RadiotapPresentBitNumber(Integer num, String str, String str2, int i) {
        super(num, str);
        if (num.intValue() % 32 == 29) {
            throw new IllegalArgumentException("Reserved for Radiotap Namespace: " + num);
        }
        if (num.intValue() % 32 == 30) {
            throw new IllegalArgumentException("Reserved for Vendor Namespace: " + num);
        }
        if (num.intValue() % 32 != 31) {
            this.namespace = str2;
            this.requiredAlignment = i;
        } else {
            throw new IllegalArgumentException("Reserved for another bitmap follows: " + num);
        }
    }

    public static RadiotapPresentBitNumber getInstance(Integer num, String str) {
        RadiotapPresentBitNumber radiotapPresentBitNumber;
        Map<Integer, RadiotapPresentBitNumber> map = registry.get(str);
        return (map == null || (radiotapPresentBitNumber = map.get(num)) == null) ? new RadiotapPresentBitNumber(num, "unknown", str, 1) : radiotapPresentBitNumber;
    }

    @Override // org.pcap4j.packet.namednumber.NamedNumber
    public int compareTo(RadiotapPresentBitNumber radiotapPresentBitNumber) {
        return value().compareTo(radiotapPresentBitNumber.value());
    }
}
