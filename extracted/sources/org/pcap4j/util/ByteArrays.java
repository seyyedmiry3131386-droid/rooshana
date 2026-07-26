package org.pcap4j.util;

import defpackage.o40;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.Adler32;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes4.dex */
public final class ByteArrays {
    public static final int BYTE_SIZE_IN_BITS = 8;
    public static final int BYTE_SIZE_IN_BYTES = 1;
    public static final int INET4_ADDRESS_SIZE_IN_BYTES = 4;
    public static final int INET6_ADDRESS_SIZE_IN_BYTES = 16;
    public static final int INT_SIZE_IN_BYTES = 4;
    public static final int LONG_SIZE_IN_BYTES = 8;
    public static final int SHORT_SIZE_IN_BYTES = 2;
    private static final Pattern NO_SEPARATOR_HEX_STRING_PATTERN = Pattern.compile("\\A([0-9a-fA-F][0-9a-fA-F])+\\z");
    private static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();
    private static final int[] CRC32C_TABLE = {0, -227835133, -516198153, 324072436, -946170081, 904991772, 648144872, -724933397, -1965467441, 2024987596, 1809983544, -1719030981, 1296289744, -1087877933, -1401372889, 1578318884, 274646895, -499825556, -244992104, 51262619, -675000208, 632279923, 922689671, -996891772, -1702387808, 1760304291, 2075979607, -1982370732, 1562183871, -1351185476, -1138329528, 1313733451, 549293790, -757723683, -1048117719, 871202090, -416867903, 357341890, 102525238, -193467851, -1436232175, 1477399826, 1264559846, -1187764763, 1845379342, -1617575411, -1933233671, 2125378298, 820201905, -1031222606, -774358714, 598981189, -143008082, 85089709, 373468761, -467063462, -1170599554, 1213305469, 1526817161, -1452612982, 2107672161, -1882520222, -1667500394, 1861252501, 1098587580, -1290756417, -1606390453, 1378610760, -2032039261, 1955203488, 1742404180, -1783531177, -878557837, 969524848, 714683780, -655182201, 205050476, -28094097, -318528869, 526918040, 1361435347, -1555146288, -1340167644, 1114974503, -1765847604, 1691668175, 2005155131, -2047885768, -604208612, 697762079, 986182379, -928222744, 476452099, -301099520, -44210700, 255256311, 1640403810, -1817374623, -2130844779, 1922457750, -1503918979, 1412925310, 1197962378, -1257441399, -350237779, 427051182, 170179418, -129025959, 746937522, -554770511, -843174843, 1070968646, 1905808397, -2081171698, -1868356358, 1657317369, -1241332974, 1147748369, 1463399397, -1521340186, -79622974, 153784257, 444234805, -401473738, 1021025245, -827320098, -572462294, 797665321, -2097792136, 1889384571, 1674398607, -1851340660, 1164749927, -1224265884, -1537745776, 1446797203, 137323447, -96149324, -384560320, 461344835, -810158936, 1037989803, 781091935, -588970148, -1834419177, 1623424788, 1939049696, -2114449437, 1429367560, -1487280117, -1274471425, 1180866812, 410100952, -367384613, -112536529, 186734380, -538233913, 763408580, 1053836080, -860110797, -1572096602, 1344288421, 1131464017, -1323612590, 1708204729, -1749376582, -2065018290, 1988219213, 680717673, -621187478, -911630946, 1002577565, -284657034, 493091189, 238226049, -61306494, -1307217207, 1082061258, 1395524158, -1589280451, 1972364758, -2015074603, -1800104671, 1725896226, 952904198, -894981883, -638100751, 731699698, -11092711, 222117402, 510512622, -335130899, -1014159676, 837199303, 582374963, -790768336, 68661723, -159632680, -450051796, 390545967, 1230274059, -1153434360, -1469116676, 1510247935, -1899042540, 2091215383, 1878366691, -1650582816, -741088853, 565732008, 854102364, -1065151905, 340358836, -433916489, -177076669, 119113024, 1493875044, -1419691417, -1204696685, 1247431312, -1634718085, 1828433272, 2141937292, -1916740209, -483350502, 291187481, 34330861, -262120466, 615137029, -691946490, -980332558, 939183345, 1776939221, -1685949482, -1999470558, 2058945313, -1368168502, 1545135305, 1330124605, -1121741762, -210866315, 17165430, 307568514, -532767615, 888469610, -962626711, -707819363, 665062302, 2042050490, -1948470087, -1735637171, 1793573966, -1104306011, 1279665062, 1595330642, -1384295599};

    private ByteArrays() {
        throw new AssertionError();
    }

    public static int calcAdler32Checksum(byte[] bArr) {
        Adler32 adler32 = new Adler32();
        adler32.update(bArr);
        return (int) adler32.getValue();
    }

    public static short calcChecksum(byte[] bArr) {
        long j = 0;
        for (int i = 1; i < bArr.length; i += 2) {
            j += 65535 & ((long) getShort(bArr, i - 1));
        }
        if (bArr.length % 2 != 0) {
            j += ((long) (bArr[bArr.length - 1] << 8)) & 65535;
        }
        while ((j >> 16) != 0) {
            j = (j >>> 16) + (j & 65535);
        }
        return (short) (~j);
    }

    public static int calcCrc32Checksum(byte[] bArr) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        return (int) crc32.getValue();
    }

    public static int calcCrc32cChecksum(byte[] bArr) {
        int i = -1;
        for (byte b : bArr) {
            i = (i >>> 8) ^ CRC32C_TABLE[(b ^ i) & 255];
        }
        return ~i;
    }

    public static byte[] clone(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte getByte(byte[] bArr, int i) {
        validateBounds(bArr, i, 1);
        return bArr[i];
    }

    public static Inet4Address getInet4Address(byte[] bArr, int i) {
        return getInet4Address(bArr, i, ByteOrder.BIG_ENDIAN);
    }

    public static Inet6Address getInet6Address(byte[] bArr, int i) {
        return getInet6Address(bArr, i, ByteOrder.BIG_ENDIAN);
    }

    public static int getInt(byte[] bArr, int i) {
        return getInt(bArr, i, ByteOrder.BIG_ENDIAN);
    }

    public static LinkLayerAddress getLinkLayerAddress(byte[] bArr, int i, int i2) {
        return getLinkLayerAddress(bArr, i, i2, ByteOrder.BIG_ENDIAN);
    }

    public static long getLong(byte[] bArr, int i) {
        return getLong(bArr, i, ByteOrder.BIG_ENDIAN);
    }

    public static MacAddress getMacAddress(byte[] bArr, int i) {
        return getMacAddress(bArr, i, ByteOrder.BIG_ENDIAN);
    }

    public static short getShort(byte[] bArr, int i) {
        return getShort(bArr, i, ByteOrder.BIG_ENDIAN);
    }

    public static byte[] getSubArray(byte[] bArr, int i, int i2) {
        validateBounds(bArr, i, i2);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static byte[] parseByteArray(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("hexString: " + str + " separator: " + str2);
        }
        if (str.startsWith("0x")) {
            str = str.substring(2);
        }
        if (str2.length() == 0) {
            Pattern pattern = NO_SEPARATOR_HEX_STRING_PATTERN;
            if (!pattern.matcher(str).matches()) {
                StringBuilder sb = new StringBuilder(100);
                sb.append("invalid hex string(");
                sb.append(str);
                sb.append("), not match pattern(");
                sb.append(pattern.pattern());
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sbA = o40.A(60, "\\A[0-9a-fA-F][0-9a-fA-F](");
            sbA.append(Pattern.quote(str2));
            sbA.append("[0-9a-fA-F][0-9a-fA-F])*\\z");
            String string = sbA.toString();
            if (!Pattern.compile(string).matcher(str).matches()) {
                StringBuilder sb2 = new StringBuilder(150);
                sb2.append("invalid hex string(");
                sb2.append(str);
                sb2.append("), not match pattern(");
                sb2.append(string);
                sb2.append(")");
                throw new IllegalArgumentException(sb2.toString());
            }
            str = str.replaceAll(Pattern.quote(str2), "");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    public static byte[] parseInet4Address(String str) {
        String[] strArrSplit = str.split("\\.", 4);
        if (strArrSplit.length != 4) {
            throw new IllegalArgumentException("Couldn't get an Inet4Address from ".concat(str));
        }
        byte[] bArr = new byte[4];
        for (int i = 0; i < 4; i++) {
            try {
                int i2 = Integer.parseInt(strArrSplit[i]);
                if (i2 < 0 || i2 > 255) {
                    throw new IllegalArgumentException("Couldn't get an Inet4Address from " + str);
                }
                bArr[i] = (byte) i2;
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException("Couldn't get an Inet4Address from ".concat(str));
            }
        }
        return bArr;
    }

    public static byte[] reverse(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[(bArr.length - i) - 1];
        }
        return bArr2;
    }

    public static byte[] toByteArray(byte b) {
        return new byte[]{b};
    }

    public static String toHexString(byte b, String str) {
        return toHexString(toByteArray(b), str);
    }

    public static void validateBounds(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("arr must not be null.");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("arr is empty.");
        }
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder(100);
            sb.append("length is zero. offset: ");
            sb.append(i);
            sb.append(", arr: ");
            sb.append(toHexString(bArr, ""));
            throw new IllegalArgumentException(sb.toString());
        }
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder sbA = o40.A(100, "arr.length: ");
            o40.J(sbA, bArr.length, ", offset: ", i, ", len: ");
            sbA.append(i2);
            sbA.append(", arr: ");
            sbA.append(toHexString(bArr, ""));
            throw new ArrayIndexOutOfBoundsException(sbA.toString());
        }
    }

    public static byte[] xor(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("arr1 must not be null.");
        }
        if (bArr2 == null) {
            throw new NullPointerException("arr2 must not be null.");
        }
        if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("arr1.length must equal to arr2.length.");
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public static Inet4Address getInet4Address(byte[] bArr, int i, ByteOrder byteOrder) {
        validateBounds(bArr, i, 4);
        if (byteOrder != null) {
            try {
                return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? (Inet4Address) InetAddress.getByAddress(reverse(getSubArray(bArr, i, 4))) : (Inet4Address) InetAddress.getByAddress(getSubArray(bArr, i, 4));
            } catch (UnknownHostException e) {
                throw new AssertionError(e);
            }
        }
        throw new NullPointerException(" bo: " + byteOrder);
    }

    public static Inet6Address getInet6Address(byte[] bArr, int i, ByteOrder byteOrder) {
        validateBounds(bArr, i, 16);
        if (byteOrder != null) {
            try {
                return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? Inet6Address.getByAddress((String) null, reverse(getSubArray(bArr, i, 16)), -1) : Inet6Address.getByAddress((String) null, getSubArray(bArr, i, 16), -1);
            } catch (UnknownHostException e) {
                throw new AssertionError(e);
            }
        }
        throw new NullPointerException(" bo: " + byteOrder);
    }

    public static int getInt(byte[] bArr, int i, ByteOrder byteOrder) {
        int i2;
        byte b;
        validateBounds(bArr, i, 4);
        if (byteOrder == null) {
            throw new NullPointerException(" bo: " + byteOrder);
        }
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            i2 = (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
            b = bArr[i];
        } else {
            i2 = (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
            b = bArr[i + 3];
        }
        return (b & 255) | i2;
    }

    public static LinkLayerAddress getLinkLayerAddress(byte[] bArr, int i, int i2, ByteOrder byteOrder) {
        validateBounds(bArr, i, i2);
        if (byteOrder != null) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? LinkLayerAddress.getByAddress(reverse(getSubArray(bArr, i, i2))) : LinkLayerAddress.getByAddress(getSubArray(bArr, i, i2));
        }
        throw new NullPointerException(" bo: " + byteOrder);
    }

    public static long getLong(byte[] bArr, int i, ByteOrder byteOrder) {
        long j;
        byte b;
        validateBounds(bArr, i, 8);
        if (byteOrder == null) {
            throw new NullPointerException(" bo: " + byteOrder);
        }
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            j = ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 6]) & 255) << 48) | (((long) bArr[i + 7]) << 56) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 1]) & 255) << 8);
            b = bArr[i];
        } else {
            j = ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 1]) & 255) << 48) | (((long) bArr[i]) << 56) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 6]) & 255) << 8);
            b = bArr[i + 7];
        }
        return (((long) b) & 255) | j;
    }

    public static MacAddress getMacAddress(byte[] bArr, int i, ByteOrder byteOrder) {
        validateBounds(bArr, i, 6);
        if (byteOrder != null) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? MacAddress.getByAddress(reverse(getSubArray(bArr, i, 6))) : MacAddress.getByAddress(getSubArray(bArr, i, 6));
        }
        throw new NullPointerException(" bo: " + byteOrder);
    }

    public static short getShort(byte[] bArr, int i, ByteOrder byteOrder) {
        int i2;
        byte b;
        validateBounds(bArr, i, 2);
        if (byteOrder == null) {
            throw new NullPointerException(" bo: " + byteOrder);
        }
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            i2 = bArr[i + 1] << 8;
            b = bArr[i];
        } else {
            i2 = bArr[i] << 8;
            b = bArr[i + 1];
        }
        return (short) ((b & 255) | i2);
    }

    public static byte[] toByteArray(short s) {
        return toByteArray(s, ByteOrder.BIG_ENDIAN);
    }

    public static String toHexString(short s, String str) {
        return toHexString(s, str, ByteOrder.BIG_ENDIAN);
    }

    public static byte[] toByteArray(short s, ByteOrder byteOrder) {
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            return new byte[]{(byte) s, (byte) (s >> 8)};
        }
        return new byte[]{(byte) (s >> 8), (byte) s};
    }

    public static String toHexString(short s, String str, ByteOrder byteOrder) {
        return toHexString(toByteArray(s, byteOrder), str);
    }

    public static byte[] concatenate(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += it.next().length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (byte[] bArr2 : list) {
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static byte[] getSubArray(byte[] bArr, int i) {
        return getSubArray(bArr, i, bArr.length - i);
    }

    public static String toHexString(int i, String str) {
        return toHexString(i, str, ByteOrder.BIG_ENDIAN);
    }

    public static String toHexString(int i, String str, ByteOrder byteOrder) {
        return toHexString(toByteArray(i, byteOrder), str);
    }

    public static byte[] toByteArray(int i) {
        return toByteArray(i, ByteOrder.BIG_ENDIAN);
    }

    public static String toHexString(long j, String str) {
        return toHexString(j, str, ByteOrder.BIG_ENDIAN);
    }

    public static int getInt(byte[] bArr, int i, int i2) {
        return getInt(bArr, i, i2, ByteOrder.BIG_ENDIAN);
    }

    public static byte[] toByteArray(int i, ByteOrder byteOrder) {
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
        }
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static String toHexString(long j, String str, ByteOrder byteOrder) {
        return toHexString(toByteArray(j, byteOrder), str);
    }

    public static int getInt(byte[] bArr, int i, int i2, ByteOrder byteOrder) {
        validateBounds(bArr, i, i2);
        if (i2 > 4) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("length must be equal or less than 4, but is: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (byteOrder != null) {
            int i3 = 0;
            if (!byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                for (int i4 = i; i4 < i + i2; i4++) {
                    i3 = (i3 << 8) | (bArr[i4] & 255);
                }
                return i3;
            }
            for (int i5 = (i2 + i) - 1; i5 >= i; i5--) {
                i3 = (bArr[i5] & 255) | (i3 << 8);
            }
            return i3;
        }
        throw new NullPointerException(" bo: " + byteOrder);
    }

    public static String toHexString(byte[] bArr, String str) {
        return toHexString(bArr, str, 0, bArr.length);
    }

    public static String toHexString(byte[] bArr, String str, int i, int i2) {
        char[] cArr;
        validateBounds(bArr, i, i2);
        if (str.length() != 0) {
            char[] charArray = str.toCharArray();
            int i3 = i2 * 2;
            int i4 = i2 - 1;
            cArr = new char[(charArray.length * i4) + i3];
            int i5 = 0;
            int i6 = 0;
            while (i5 < i4) {
                byte b = bArr[i + i5];
                char[] cArr2 = HEX_CHARS;
                cArr[i6] = cArr2[(b & 255) >>> 4];
                cArr[i6 + 1] = cArr2[b & 15];
                i6 += 2;
                for (char c : charArray) {
                    cArr[i6] = c;
                    i6++;
                }
                i5++;
            }
            byte b2 = bArr[i + i5];
            char[] cArr3 = HEX_CHARS;
            cArr[i6] = cArr3[(b2 & 255) >>> 4];
            cArr[i6 + 1] = cArr3[b2 & 15];
        } else {
            cArr = new char[i2 * 2];
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                byte b3 = bArr[i + i8];
                char[] cArr4 = HEX_CHARS;
                cArr[i7] = cArr4[(b3 & 255) >>> 4];
                cArr[i7 + 1] = cArr4[b3 & 15];
                i7 += 2;
            }
        }
        return new String(cArr);
    }

    public static byte[] toByteArray(int i, int i2) {
        return toByteArray(i, i2, ByteOrder.BIG_ENDIAN);
    }

    public static byte[] toByteArray(int i, int i2, ByteOrder byteOrder) {
        if (i2 <= 4) {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                while (i3 < i2) {
                    bArr[(i2 - i3) - 1] = (byte) (i >> (i3 * 8));
                    i3++;
                }
            } else {
                while (i3 < i2) {
                    bArr[i3] = (byte) (i >> (i3 * 8));
                    i3++;
                }
            }
            return bArr;
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("length must be equal or less than 4, but is: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static byte[] toByteArray(long j) {
        return toByteArray(j, ByteOrder.BIG_ENDIAN);
    }

    public static byte[] toByteArray(long j, ByteOrder byteOrder) {
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            return new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)};
        }
        return new byte[]{(byte) (j >> 56), (byte) (j >> 48), (byte) (j >> 40), (byte) (j >> 32), (byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) j};
    }

    public static byte[] toByteArray(MacAddress macAddress) {
        return toByteArray(macAddress, ByteOrder.BIG_ENDIAN);
    }

    public static byte[] toByteArray(MacAddress macAddress, ByteOrder byteOrder) {
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            return reverse(macAddress.getAddress());
        }
        return macAddress.getAddress();
    }

    public static byte[] toByteArray(LinkLayerAddress linkLayerAddress) {
        return toByteArray(linkLayerAddress, ByteOrder.BIG_ENDIAN);
    }

    public static byte[] toByteArray(LinkLayerAddress linkLayerAddress, ByteOrder byteOrder) {
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            return reverse(linkLayerAddress.getAddress());
        }
        return linkLayerAddress.getAddress();
    }

    public static byte[] toByteArray(InetAddress inetAddress) {
        return toByteArray(inetAddress, ByteOrder.BIG_ENDIAN);
    }

    public static byte[] toByteArray(InetAddress inetAddress, ByteOrder byteOrder) {
        if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
            return reverse(inetAddress.getAddress());
        }
        return inetAddress.getAddress();
    }
}
