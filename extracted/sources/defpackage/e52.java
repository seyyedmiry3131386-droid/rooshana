package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import io.sentry.android.core.t0;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes.dex */
public final class e52 {
    public static final byte[] A;
    public static final byte[] B;
    public static final String[] C;
    public static final int[] D;
    public static final byte[] E;
    public static final b52 F;
    public static final b52[][] G;
    public static final b52[] H;
    public static final HashMap[] I;
    public static final HashMap[] J;
    public static final Set K;
    public static final HashMap L;
    public static final Charset M;
    public static final byte[] N;
    public static final byte[] O;
    public static final boolean m = Log.isLoggable("ExifInterface", 3);
    public static final int[] n;
    public static final int[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    public final FileDescriptor a;
    public final AssetManager.AssetInputStream b;
    public int c;
    public final HashMap[] d;
    public final HashSet e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public a52 l;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        n = new int[]{8, 8, 8};
        o = new int[]{8};
        p = new byte[]{-1, -40, -1};
        q = new byte[]{102, 116, 121, 112};
        r = new byte[]{109, 105, 102, 49};
        s = new byte[]{104, 101, 105, 99};
        t = new byte[]{97, 118, 105, 102};
        u = new byte[]{97, 118, 105, 115};
        v = new byte[]{79, 76, 89, 77, 80, 0};
        w = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        x = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        y = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        z = new byte[]{82, 73, 70, 70};
        A = new byte[]{87, 69, 66, 80};
        B = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        C = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        D = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        E = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        b52[] b52VarArr = {new b52("NewSubfileType", 254, 4), new b52("SubfileType", 255, 4), new b52("ImageWidth", 256, 3, 4), new b52("ImageLength", 257, 3, 4), new b52("BitsPerSample", 258, 3), new b52("Compression", 259, 3), new b52("PhotometricInterpretation", 262, 3), new b52("ImageDescription", 270, 2), new b52("Make", 271, 2), new b52("Model", 272, 2), new b52("StripOffsets", 273, 3, 4), new b52("Orientation", 274, 3), new b52("SamplesPerPixel", 277, 3), new b52("RowsPerStrip", 278, 3, 4), new b52("StripByteCounts", 279, 3, 4), new b52("XResolution", 282, 5), new b52("YResolution", 283, 5), new b52("PlanarConfiguration", 284, 3), new b52("ResolutionUnit", 296, 3), new b52("TransferFunction", 301, 3), new b52("Software", 305, 2), new b52("DateTime", 306, 2), new b52("Artist", 315, 2), new b52("WhitePoint", 318, 5), new b52("PrimaryChromaticities", 319, 5), new b52("SubIFDPointer", 330, 4), new b52("JPEGInterchangeFormat", 513, 4), new b52("JPEGInterchangeFormatLength", 514, 4), new b52("YCbCrCoefficients", 529, 5), new b52("YCbCrSubSampling", 530, 3), new b52("YCbCrPositioning", 531, 3), new b52("ReferenceBlackWhite", 532, 5), new b52("Copyright", 33432, 2), new b52("ExifIFDPointer", 34665, 4), new b52("GPSInfoIFDPointer", 34853, 4), new b52("SensorTopBorder", 4, 4), new b52("SensorLeftBorder", 5, 4), new b52("SensorBottomBorder", 6, 4), new b52("SensorRightBorder", 7, 4), new b52("ISO", 23, 3), new b52("JpgFromRaw", 46, 7), new b52("Xmp", 700, 1)};
        b52[] b52VarArr2 = {new b52("ExposureTime", 33434, 5), new b52("FNumber", 33437, 5), new b52("ExposureProgram", 34850, 3), new b52("SpectralSensitivity", 34852, 2), new b52("PhotographicSensitivity", 34855, 3), new b52("OECF", 34856, 7), new b52("SensitivityType", 34864, 3), new b52("StandardOutputSensitivity", 34865, 4), new b52("RecommendedExposureIndex", 34866, 4), new b52("ISOSpeed", 34867, 4), new b52("ISOSpeedLatitudeyyy", 34868, 4), new b52("ISOSpeedLatitudezzz", 34869, 4), new b52("ExifVersion", 36864, 2), new b52("DateTimeOriginal", 36867, 2), new b52("DateTimeDigitized", 36868, 2), new b52("OffsetTime", 36880, 2), new b52("OffsetTimeOriginal", 36881, 2), new b52("OffsetTimeDigitized", 36882, 2), new b52("ComponentsConfiguration", 37121, 7), new b52("CompressedBitsPerPixel", 37122, 5), new b52("ShutterSpeedValue", 37377, 10), new b52("ApertureValue", 37378, 5), new b52("BrightnessValue", 37379, 10), new b52("ExposureBiasValue", 37380, 10), new b52("MaxApertureValue", 37381, 5), new b52("SubjectDistance", 37382, 5), new b52("MeteringMode", 37383, 3), new b52("LightSource", 37384, 3), new b52("Flash", 37385, 3), new b52("FocalLength", 37386, 5), new b52("SubjectArea", 37396, 3), new b52("MakerNote", 37500, 7), new b52("UserComment", 37510, 7), new b52("SubSecTime", 37520, 2), new b52("SubSecTimeOriginal", 37521, 2), new b52("SubSecTimeDigitized", 37522, 2), new b52("FlashpixVersion", 40960, 7), new b52("ColorSpace", 40961, 3), new b52("PixelXDimension", 40962, 3, 4), new b52("PixelYDimension", 40963, 3, 4), new b52("RelatedSoundFile", 40964, 2), new b52("InteroperabilityIFDPointer", 40965, 4), new b52("FlashEnergy", 41483, 5), new b52("SpatialFrequencyResponse", 41484, 7), new b52("FocalPlaneXResolution", 41486, 5), new b52("FocalPlaneYResolution", 41487, 5), new b52("FocalPlaneResolutionUnit", 41488, 3), new b52("SubjectLocation", 41492, 3), new b52("ExposureIndex", 41493, 5), new b52("SensingMethod", 41495, 3), new b52("FileSource", 41728, 7), new b52("SceneType", 41729, 7), new b52("CFAPattern", 41730, 7), new b52("CustomRendered", 41985, 3), new b52("ExposureMode", 41986, 3), new b52("WhiteBalance", 41987, 3), new b52("DigitalZoomRatio", 41988, 5), new b52("FocalLengthIn35mmFilm", 41989, 3), new b52("SceneCaptureType", 41990, 3), new b52("GainControl", 41991, 3), new b52("Contrast", 41992, 3), new b52("Saturation", 41993, 3), new b52("Sharpness", 41994, 3), new b52("DeviceSettingDescription", 41995, 7), new b52("SubjectDistanceRange", 41996, 3), new b52("ImageUniqueID", 42016, 2), new b52("CameraOwnerName", 42032, 2), new b52("BodySerialNumber", 42033, 2), new b52("LensSpecification", 42034, 5), new b52("LensMake", 42035, 2), new b52("LensModel", 42036, 2), new b52("Gamma", 42240, 5), new b52("DNGVersion", 50706, 1), new b52("DefaultCropSize", 50720, 3, 4)};
        b52[] b52VarArr3 = {new b52("GPSVersionID", 0, 1), new b52("GPSLatitudeRef", 1, 2), new b52("GPSLatitude", 2, 5, 10), new b52("GPSLongitudeRef", 3, 2), new b52("GPSLongitude", 4, 5, 10), new b52("GPSAltitudeRef", 5, 1), new b52("GPSAltitude", 6, 5), new b52("GPSTimeStamp", 7, 5), new b52("GPSSatellites", 8, 2), new b52("GPSStatus", 9, 2), new b52("GPSMeasureMode", 10, 2), new b52("GPSDOP", 11, 5), new b52("GPSSpeedRef", 12, 2), new b52("GPSSpeed", 13, 5), new b52("GPSTrackRef", 14, 2), new b52("GPSTrack", 15, 5), new b52("GPSImgDirectionRef", 16, 2), new b52("GPSImgDirection", 17, 5), new b52("GPSMapDatum", 18, 2), new b52("GPSDestLatitudeRef", 19, 2), new b52("GPSDestLatitude", 20, 5), new b52("GPSDestLongitudeRef", 21, 2), new b52("GPSDestLongitude", 22, 5), new b52("GPSDestBearingRef", 23, 2), new b52("GPSDestBearing", 24, 5), new b52("GPSDestDistanceRef", 25, 2), new b52("GPSDestDistance", 26, 5), new b52("GPSProcessingMethod", 27, 7), new b52("GPSAreaInformation", 28, 7), new b52("GPSDateStamp", 29, 2), new b52("GPSDifferential", 30, 3), new b52("GPSHPositioningError", 31, 5)};
        b52[] b52VarArr4 = {new b52("InteroperabilityIndex", 1, 2)};
        b52[] b52VarArr5 = {new b52("NewSubfileType", 254, 4), new b52("SubfileType", 255, 4), new b52("ThumbnailImageWidth", 256, 3, 4), new b52("ThumbnailImageLength", 257, 3, 4), new b52("BitsPerSample", 258, 3), new b52("Compression", 259, 3), new b52("PhotometricInterpretation", 262, 3), new b52("ImageDescription", 270, 2), new b52("Make", 271, 2), new b52("Model", 272, 2), new b52("StripOffsets", 273, 3, 4), new b52("ThumbnailOrientation", 274, 3), new b52("SamplesPerPixel", 277, 3), new b52("RowsPerStrip", 278, 3, 4), new b52("StripByteCounts", 279, 3, 4), new b52("XResolution", 282, 5), new b52("YResolution", 283, 5), new b52("PlanarConfiguration", 284, 3), new b52("ResolutionUnit", 296, 3), new b52("TransferFunction", 301, 3), new b52("Software", 305, 2), new b52("DateTime", 306, 2), new b52("Artist", 315, 2), new b52("WhitePoint", 318, 5), new b52("PrimaryChromaticities", 319, 5), new b52("SubIFDPointer", 330, 4), new b52("JPEGInterchangeFormat", 513, 4), new b52("JPEGInterchangeFormatLength", 514, 4), new b52("YCbCrCoefficients", 529, 5), new b52("YCbCrSubSampling", 530, 3), new b52("YCbCrPositioning", 531, 3), new b52("ReferenceBlackWhite", 532, 5), new b52("Copyright", 33432, 2), new b52("ExifIFDPointer", 34665, 4), new b52("GPSInfoIFDPointer", 34853, 4), new b52("DNGVersion", 50706, 1), new b52("DefaultCropSize", 50720, 3, 4)};
        F = new b52("StripOffsets", 273, 3);
        G = new b52[][]{b52VarArr, b52VarArr2, b52VarArr3, b52VarArr4, b52VarArr5, b52VarArr, new b52[]{new b52("ThumbnailImage", 256, 7), new b52("CameraSettingsIFDPointer", 8224, 4), new b52("ImageProcessingIFDPointer", 8256, 4)}, new b52[]{new b52("PreviewImageStart", 257, 4), new b52("PreviewImageLength", 258, 4)}, new b52[]{new b52("AspectFrame", 4371, 3)}, new b52[]{new b52("ColorSpace", 55, 3)}};
        H = new b52[]{new b52("SubIFDPointer", 330, 4), new b52("ExifIFDPointer", 34665, 4), new b52("GPSInfoIFDPointer", 34853, 4), new b52("InteroperabilityIFDPointer", 40965, 4), new b52("CameraSettingsIFDPointer", 8224, 1), new b52("ImageProcessingIFDPointer", 8256, 1)};
        I = new HashMap[10];
        J = new HashMap[10];
        K = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        L = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        M = charsetForName;
        N = "Exif\u0000\u0000".getBytes(charsetForName);
        O = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            b52[][] b52VarArr6 = G;
            if (i >= b52VarArr6.length) {
                HashMap map = L;
                b52[] b52VarArr7 = H;
                map.put(Integer.valueOf(b52VarArr7[0].a), 5);
                map.put(Integer.valueOf(b52VarArr7[1].a), 1);
                map.put(Integer.valueOf(b52VarArr7[2].a), 2);
                map.put(Integer.valueOf(b52VarArr7[3].a), 3);
                map.put(Integer.valueOf(b52VarArr7[4].a), 7);
                map.put(Integer.valueOf(b52VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            I[i] = new HashMap();
            J[i] = new HashMap();
            for (b52 b52Var : b52VarArr6[i]) {
                I[i].put(Integer.valueOf(b52Var.a), b52Var);
                J[i].put(b52Var.b, b52Var);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4 A[Catch: all -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:12:0x0046, B:14:0x0049, B:21:0x005e, B:27:0x007b, B:34:0x008e, B:40:0x00a1, B:37:0x0096, B:38:0x009a, B:39:0x009e, B:41:0x00ab, B:43:0x00b4, B:45:0x00ba, B:47:0x00c0, B:49:0x00c6, B:54:0x00d4), top: B:67:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e52(java.io.InputStream r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e52.<init>(java.io.InputStream):void");
    }

    public static ByteOrder r(z42 z42Var) throws IOException {
        short s2 = z42Var.readShort();
        if (s2 == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s2));
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(M);
            map.put("DateTime", new a52(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", a52.a(0L, this.f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", a52.a(0L, this.f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", a52.a(0L, this.f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", a52.a(0L, this.f));
        }
    }

    public final String b(String str) {
        a52 a52VarD = d(str);
        if (a52VarD != null) {
            int i = a52VarD.a;
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    t0.m("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                c52[] c52VarArr = (c52[]) a52VarD.g(this.f);
                if (c52VarArr == null || c52VarArr.length != 3) {
                    t0.m("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c52VarArr));
                    return null;
                }
                c52 c52Var = c52VarArr[0];
                Integer numValueOf = Integer.valueOf((int) (c52Var.a / c52Var.b));
                c52 c52Var2 = c52VarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c52Var2.a / c52Var2.b));
                c52 c52Var3 = c52VarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c52Var3.a / c52Var3.b)));
            }
            if (!K.contains(str)) {
                return a52VarD.f(this.f);
            }
            try {
                return Double.toString(a52VarD.d(this.f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int c() {
        a52 a52VarD = d("Orientation");
        if (a52VarD == null) {
            return 1;
        }
        try {
            return a52VarD.e(this.f);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final a52 d(String str) {
        a52 a52Var;
        int i;
        a52 a52Var2;
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.c) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (a52Var2 = this.l) != null)) {
            return a52Var2;
        }
        for (int i2 = 0; i2 < G.length; i2++) {
            a52 a52Var3 = (a52) this.d[i2].get(str);
            if (a52Var3 != null) {
                return a52Var3;
            }
        }
        if (!"Xmp".equals(str) || (a52Var = this.l) == null) {
            return null;
        }
        return a52Var;
    }

    public final void e(d52 d52Var, int i) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i == 15 && i2 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new y42(d52Var));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", a52.c(Integer.parseInt(strExtractMetadata), this.f));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", a52.c(Integer.parseInt(strExtractMetadata3), this.f));
                }
                if (strExtractMetadata2 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata2);
                    mapArr[0].put("Orientation", a52.c(i3 != 90 ? i3 != 180 ? i3 != 270 ? 1 : 8 : 3 : 6, this.f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata4);
                    int i5 = Integer.parseInt(strExtractMetadata5);
                    if (i5 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    d52Var.d(i4);
                    byte[] bArr = new byte[6];
                    d52Var.readFully(bArr);
                    int i6 = i4 + 6;
                    int i7 = i5 - 6;
                    if (!Arrays.equals(bArr, N)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i7];
                    d52Var.readFully(bArr2);
                    this.h = i6;
                    s(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i8 = Integer.parseInt(strExtractMetadata8);
                    int i9 = Integer.parseInt(strExtractMetadata9);
                    long j = i8;
                    d52Var.d(j);
                    byte[] bArr3 = new byte[i9];
                    d52Var.readFully(bArr3);
                    this.l = new a52(j, bArr3, 1, i9);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } finally {
            }
        } catch (RuntimeException e) {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x005d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0060. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0063. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114 A[LOOP:0: B:10:0x0024->B:55:0x0114, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011b A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1091)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1116)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.z42 r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e52.f(z42, int, int):void");
    }

    public final int g(BufferedInputStream bufferedInputStream) throws Throwable {
        z42 z42Var;
        int i;
        z42 z42Var2;
        int i2;
        z42 z42Var3;
        z42 z42Var4;
        int i3;
        z42 z42Var5;
        z42 z42Var6;
        int i4;
        int i5;
        int i6;
        long j;
        byte[] bArr;
        long j2;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i7 = 0;
        while (true) {
            byte[] bArr3 = p;
            if (i7 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i7] != bArr3[i7]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i8 = 0; i8 < bytes.length; i8++) {
                    if (bArr2[i8] != bytes[i8]) {
                        try {
                            z42Var2 = new z42(bArr2);
                            try {
                                try {
                                    j = z42Var2.readInt();
                                    bArr = new byte[4];
                                    z42Var2.readFully(bArr);
                                } catch (Throwable th) {
                                    th = th;
                                    z42Var = z42Var2;
                                    if (z42Var != null) {
                                        z42Var.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused) {
                                i = 0;
                            }
                        } catch (Exception unused2) {
                            i = 0;
                            z42Var2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            z42Var = null;
                        }
                        if (Arrays.equals(bArr, q)) {
                            if (j == 1) {
                                j = z42Var2.readLong();
                                j2 = 16;
                                if (j < 16) {
                                }
                                z42Var2.close();
                                i2 = 0;
                                i = 0;
                            } else {
                                j2 = 8;
                            }
                            long j3 = 5000;
                            if (j > j3) {
                                j = j3;
                            }
                            long j4 = j - j2;
                            if (j4 < 8) {
                                z42Var2.close();
                                i2 = 0;
                                i = 0;
                            } else {
                                byte[] bArr4 = new byte[4];
                                boolean z2 = false;
                                boolean z3 = false;
                                boolean z4 = false;
                                for (long j5 = 0; j5 < j4 / 4; j5++) {
                                    try {
                                        z42Var2.readFully(bArr4);
                                        if (j5 != 1) {
                                            i = 0;
                                            try {
                                                if (Arrays.equals(bArr4, r)) {
                                                    z2 = true;
                                                } else if (Arrays.equals(bArr4, s)) {
                                                    z3 = true;
                                                } else if (Arrays.equals(bArr4, t) || Arrays.equals(bArr4, u)) {
                                                    z4 = true;
                                                }
                                                if (z2) {
                                                    if (z3) {
                                                        z42Var2.close();
                                                        i2 = 12;
                                                        break;
                                                    }
                                                    if (z4) {
                                                        z42Var2.close();
                                                        i2 = 15;
                                                        break;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } catch (Exception unused3) {
                                                if (z42Var2 != null) {
                                                    z42Var2.close();
                                                }
                                                i2 = i;
                                            }
                                        }
                                    } catch (EOFException unused4) {
                                        i = 0;
                                        z42Var2.close();
                                        i2 = i;
                                    }
                                }
                                i = 0;
                                z42Var2.close();
                                i2 = i;
                            }
                        } else {
                            z42Var2.close();
                            i2 = 0;
                            i = 0;
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        try {
                            z42Var4 = new z42(bArr2);
                            try {
                                ByteOrder byteOrderR = r(z42Var4);
                                this.f = byteOrderR;
                                z42Var4.c = byteOrderR;
                                short s2 = z42Var4.readShort();
                                i3 = (s2 == 20306 || s2 == 21330) ? 1 : i;
                                z42Var4.close();
                            } catch (Exception unused5) {
                                if (z42Var4 != null) {
                                    z42Var4.close();
                                }
                                i3 = i;
                            } catch (Throwable th3) {
                                th = th3;
                                z42Var3 = z42Var4;
                                if (z42Var3 != null) {
                                    z42Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused6) {
                            z42Var4 = null;
                        } catch (Throwable th4) {
                            th = th4;
                            z42Var3 = null;
                        }
                        if (i3 != 0) {
                            return 7;
                        }
                        try {
                            z42 z42Var7 = new z42(bArr2);
                            try {
                                ByteOrder byteOrderR2 = r(z42Var7);
                                this.f = byteOrderR2;
                                z42Var7.c = byteOrderR2;
                                i4 = z42Var7.readShort() == 85 ? 1 : i;
                                z42Var7.close();
                            } catch (Exception unused7) {
                                z42Var6 = z42Var7;
                                if (z42Var6 != null) {
                                    z42Var6.close();
                                }
                                i4 = i;
                            } catch (Throwable th5) {
                                th = th5;
                                z42Var5 = z42Var7;
                                if (z42Var5 != null) {
                                    z42Var5.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused8) {
                            z42Var6 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            z42Var5 = null;
                        }
                        if (i4 != 0) {
                            return 10;
                        }
                        int i9 = i;
                        while (true) {
                            byte[] bArr5 = x;
                            if (i9 >= bArr5.length) {
                                i5 = 1;
                                break;
                            }
                            if (bArr2[i9] != bArr5[i9]) {
                                i5 = i;
                                break;
                            }
                            i9++;
                        }
                        if (i5 != 0) {
                            return 13;
                        }
                        int i10 = i;
                        while (true) {
                            byte[] bArr6 = z;
                            if (i10 >= bArr6.length) {
                                int i11 = i;
                                while (true) {
                                    byte[] bArr7 = A;
                                    if (i11 >= bArr7.length) {
                                        i6 = 1;
                                        break;
                                    }
                                    if (bArr2[bArr6.length + i11 + 4] != bArr7[i11]) {
                                        break;
                                    }
                                    i11++;
                                }
                            } else {
                                if (bArr2[i10] != bArr6[i10]) {
                                    break;
                                }
                                i10++;
                            }
                        }
                        i6 = i;
                        if (i6 != 0) {
                            return 14;
                        }
                        return i;
                    }
                }
                return 9;
            }
            i7++;
        }
    }

    public final void h(d52 d52Var) throws Throwable {
        int i;
        int i2;
        k(d52Var);
        HashMap[] mapArr = this.d;
        a52 a52Var = (a52) mapArr[1].get("MakerNote");
        if (a52Var != null) {
            d52 d52Var2 = new d52(a52Var.d);
            d52Var2.c = this.f;
            byte[] bArr = v;
            byte[] bArr2 = new byte[bArr.length];
            d52Var2.readFully(bArr2);
            d52Var2.d(0L);
            byte[] bArr3 = w;
            byte[] bArr4 = new byte[bArr3.length];
            d52Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                d52Var2.d(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                d52Var2.d(12L);
            }
            t(d52Var2, 6);
            a52 a52Var2 = (a52) mapArr[7].get("PreviewImageStart");
            a52 a52Var3 = (a52) mapArr[7].get("PreviewImageLength");
            if (a52Var2 != null && a52Var3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", a52Var2);
                mapArr[5].put("JPEGInterchangeFormatLength", a52Var3);
            }
            a52 a52Var4 = (a52) mapArr[8].get("AspectFrame");
            if (a52Var4 != null) {
                int[] iArr = (int[]) a52Var4.g(this.f);
                if (iArr == null || iArr.length != 4) {
                    t0.m("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                a52 a52VarC = a52.c(i5, this.f);
                a52 a52VarC2 = a52.c(i6, this.f);
                mapArr[0].put("ImageWidth", a52VarC);
                mapArr[0].put("ImageLength", a52VarC2);
            }
        }
    }

    public final void i(z42 z42Var) throws Throwable {
        if (m) {
            Objects.toString(z42Var);
        }
        z42Var.c = ByteOrder.BIG_ENDIAN;
        int i = z42Var.b;
        z42Var.b(x.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                return;
            }
            try {
                int i2 = z42Var.readInt();
                int i3 = z42Var.readInt();
                int i4 = z42Var.b;
                int i5 = i4 + i2 + 4;
                int i6 = i4 - i;
                if (i6 == 16 && i3 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i3 == 1229278788) {
                    return;
                }
                if (i3 == 1700284774 && !z2) {
                    this.h = i6;
                    byte[] bArr = new byte[i2];
                    z42Var.readFully(bArr);
                    int i7 = z42Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i3 >>> 24);
                    crc32.update(i3 >>> 16);
                    crc32.update(i3 >>> 8);
                    crc32.update(i3);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i7) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i7 + ", calculated CRC value: " + crc32.getValue());
                    }
                    s(0, bArr);
                    y();
                    v(new z42(bArr));
                    z2 = true;
                } else if (i3 == 1767135348 && !z3) {
                    byte[] bArr2 = y;
                    if (i2 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        z42Var.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i8 = z42Var.b - i;
                            int i9 = i2 - length;
                            byte[] bArr4 = new byte[i9];
                            z42Var.readFully(bArr4);
                            this.l = new a52(i8, bArr4, 1, i9);
                            z3 = true;
                        }
                    }
                }
                z42Var.b(i5 - z42Var.b);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    public final void j(z42 z42Var) throws Throwable {
        if (m) {
            Objects.toString(z42Var);
        }
        z42Var.b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        z42Var.readFully(bArr);
        z42Var.readFully(bArr2);
        z42Var.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        z42Var.b(i - z42Var.b);
        z42Var.readFully(bArr4);
        f(new z42(bArr4), i, 5);
        z42Var.b(i3 - z42Var.b);
        z42Var.c = ByteOrder.BIG_ENDIAN;
        int i4 = z42Var.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = z42Var.readUnsignedShort();
            int unsignedShort2 = z42Var.readUnsignedShort();
            if (unsignedShort == F.a) {
                short s2 = z42Var.readShort();
                short s3 = z42Var.readShort();
                a52 a52VarC = a52.c(s2, this.f);
                a52 a52VarC2 = a52.c(s3, this.f);
                HashMap[] mapArr = this.d;
                mapArr[0].put("ImageLength", a52VarC);
                mapArr[0].put("ImageWidth", a52VarC2);
                return;
            }
            z42Var.b(unsignedShort2);
        }
    }

    public final void k(d52 d52Var) throws Throwable {
        p(d52Var);
        t(d52Var, 0);
        x(d52Var, 0);
        x(d52Var, 5);
        x(d52Var, 4);
        y();
        if (this.c == 8) {
            HashMap[] mapArr = this.d;
            a52 a52Var = (a52) mapArr[1].get("MakerNote");
            if (a52Var != null) {
                d52 d52Var2 = new d52(a52Var.d);
                d52Var2.c = this.f;
                d52Var2.b(6);
                t(d52Var2, 9);
                a52 a52Var2 = (a52) mapArr[9].get("ColorSpace");
                if (a52Var2 != null) {
                    mapArr[1].put("ColorSpace", a52Var2);
                }
            }
        }
    }

    public final void l(d52 d52Var) throws Throwable {
        if (m) {
            Objects.toString(d52Var);
        }
        k(d52Var);
        HashMap[] mapArr = this.d;
        a52 a52Var = (a52) mapArr[0].get("JpgFromRaw");
        if (a52Var != null) {
            f(new z42(a52Var.d), (int) a52Var.c, 5);
        }
        a52 a52Var2 = (a52) mapArr[0].get("ISO");
        a52 a52Var3 = (a52) mapArr[1].get("PhotographicSensitivity");
        if (a52Var2 == null || a52Var3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", a52Var2);
    }

    public final void m(z42 z42Var) throws Throwable {
        if (m) {
            Objects.toString(z42Var);
        }
        z42Var.c = ByteOrder.LITTLE_ENDIAN;
        z42Var.b(z.length);
        int i = z42Var.readInt() + 8;
        byte[] bArr = A;
        z42Var.b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                z42Var.readFully(bArr2);
                int i2 = z42Var.readInt();
                int i3 = length + 8;
                if (Arrays.equals(B, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i2];
                    z42Var.readFully(bArrCopyOfRange);
                    byte[] bArr3 = N;
                    if (s7.b0(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                    }
                    this.h = i3;
                    s(0, bArrCopyOfRange);
                    v(new z42(bArrCopyOfRange));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                z42Var.b(i2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void n(z42 z42Var, HashMap map) throws Throwable {
        a52 a52Var = (a52) map.get("JPEGInterchangeFormat");
        a52 a52Var2 = (a52) map.get("JPEGInterchangeFormatLength");
        if (a52Var == null || a52Var2 == null) {
            return;
        }
        int iE = a52Var.e(this.f);
        int iE2 = a52Var2.e(this.f);
        if (this.c == 7) {
            iE += this.i;
        }
        if (iE <= 0 || iE2 <= 0 || this.b != null || this.a != null) {
            return;
        }
        z42Var.b(iE);
        z42Var.readFully(new byte[iE2]);
    }

    public final boolean o(HashMap map) {
        a52 a52Var = (a52) map.get("ImageLength");
        a52 a52Var2 = (a52) map.get("ImageWidth");
        if (a52Var == null || a52Var2 == null) {
            return false;
        }
        return a52Var.e(this.f) <= 512 && a52Var2.e(this.f) <= 512;
    }

    public final void p(d52 d52Var) throws IOException {
        ByteOrder byteOrderR = r(d52Var);
        this.f = byteOrderR;
        d52Var.c = byteOrderR;
        int unsignedShort = d52Var.readUnsignedShort();
        int i = this.c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i2 = d52Var.readInt();
        if (i2 < 8) {
            throw new IOException(rm7.n(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            d52Var.b(i3);
        }
    }

    public final void q() throws Throwable {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.d;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry entry : mapArr[i].entrySet()) {
                a52 a52Var = (a52) entry.getValue();
                a52Var.toString();
                a52Var.f(this.f);
            }
            i++;
        }
    }

    public final void s(int i, byte[] bArr) throws IOException {
        d52 d52Var = new d52(bArr);
        p(d52Var);
        t(d52Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(defpackage.d52 r34, int r35) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e52.t(d52, int):void");
    }

    public final void u(int i, String str, String str2) {
        HashMap[] mapArr = this.d;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (a52) map.get(str));
        mapArr[i].remove(str);
    }

    public final void v(z42 z42Var) throws Throwable {
        a52 a52Var;
        HashMap map = this.d[4];
        a52 a52Var2 = (a52) map.get("Compression");
        if (a52Var2 == null) {
            n(z42Var, map);
            return;
        }
        int iE = a52Var2.e(this.f);
        if (iE != 1) {
            if (iE == 6) {
                n(z42Var, map);
                return;
            } else if (iE != 7) {
                return;
            }
        }
        a52 a52Var3 = (a52) map.get("BitsPerSample");
        if (a52Var3 != null) {
            int[] iArr = (int[]) a52Var3.g(this.f);
            int[] iArr2 = n;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.c != 3 || (a52Var = (a52) map.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int iE2 = a52Var.e(this.f);
                if ((iE2 != 1 || !Arrays.equals(iArr, o)) && (iE2 != 6 || !Arrays.equals(iArr, iArr2))) {
                    return;
                }
            }
            a52 a52Var4 = (a52) map.get("StripOffsets");
            a52 a52Var5 = (a52) map.get("StripByteCounts");
            if (a52Var4 == null || a52Var5 == null) {
                return;
            }
            long[] jArrJ = s7.j(a52Var4.g(this.f));
            long[] jArrJ2 = s7.j(a52Var5.g(this.f));
            if (jArrJ == null || jArrJ.length == 0) {
                t0.m("ExifInterface", "stripOffsets should not be null or have zero length.");
                return;
            }
            if (jArrJ2 == null || jArrJ2.length == 0) {
                t0.m("ExifInterface", "stripByteCounts should not be null or have zero length.");
                return;
            }
            if (jArrJ.length != jArrJ2.length) {
                t0.m("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                return;
            }
            long j = 0;
            for (long j2 : jArrJ2) {
                j += j2;
            }
            byte[] bArr = new byte[(int) j];
            this.g = true;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < jArrJ.length; i3++) {
                int i4 = (int) jArrJ[i3];
                int i5 = (int) jArrJ2[i3];
                if (i3 < jArrJ.length - 1 && i4 + i5 != jArrJ[i3 + 1]) {
                    this.g = false;
                }
                int i6 = i4 - i;
                if (i6 < 0) {
                    return;
                }
                try {
                    z42Var.b(i6);
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    z42Var.readFully(bArr2);
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                } catch (EOFException unused) {
                    return;
                }
            }
            if (this.g) {
                long j3 = jArrJ[0];
            }
        }
    }

    public final void w(int i, int i2) throws Throwable {
        HashMap[] mapArr = this.d;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        a52 a52Var = (a52) mapArr[i].get("ImageLength");
        a52 a52Var2 = (a52) mapArr[i].get("ImageWidth");
        a52 a52Var3 = (a52) mapArr[i2].get("ImageLength");
        a52 a52Var4 = (a52) mapArr[i2].get("ImageWidth");
        if (a52Var == null || a52Var2 == null || a52Var3 == null || a52Var4 == null) {
            return;
        }
        int iE = a52Var.e(this.f);
        int iE2 = a52Var2.e(this.f);
        int iE3 = a52Var3.e(this.f);
        int iE4 = a52Var4.e(this.f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void x(d52 d52Var, int i) throws Throwable {
        a52 a52VarC;
        a52 a52VarC2;
        HashMap[] mapArr = this.d;
        a52 a52Var = (a52) mapArr[i].get("DefaultCropSize");
        a52 a52Var2 = (a52) mapArr[i].get("SensorTopBorder");
        a52 a52Var3 = (a52) mapArr[i].get("SensorLeftBorder");
        a52 a52Var4 = (a52) mapArr[i].get("SensorBottomBorder");
        a52 a52Var5 = (a52) mapArr[i].get("SensorRightBorder");
        if (a52Var != null) {
            if (a52Var.a == 5) {
                c52[] c52VarArr = (c52[]) a52Var.g(this.f);
                if (c52VarArr == null || c52VarArr.length != 2) {
                    t0.m("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c52VarArr));
                    return;
                }
                a52VarC = a52.b(c52VarArr[0], this.f);
                a52VarC2 = a52.b(c52VarArr[1], this.f);
            } else {
                int[] iArr = (int[]) a52Var.g(this.f);
                if (iArr == null || iArr.length != 2) {
                    t0.m("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                a52VarC = a52.c(iArr[0], this.f);
                a52VarC2 = a52.c(iArr[1], this.f);
            }
            mapArr[i].put("ImageWidth", a52VarC);
            mapArr[i].put("ImageLength", a52VarC2);
            return;
        }
        if (a52Var2 != null && a52Var3 != null && a52Var4 != null && a52Var5 != null) {
            int iE = a52Var2.e(this.f);
            int iE2 = a52Var4.e(this.f);
            int iE3 = a52Var5.e(this.f);
            int iE4 = a52Var3.e(this.f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            a52 a52VarC3 = a52.c(iE2 - iE, this.f);
            a52 a52VarC4 = a52.c(iE3 - iE4, this.f);
            mapArr[i].put("ImageLength", a52VarC3);
            mapArr[i].put("ImageWidth", a52VarC4);
            return;
        }
        a52 a52Var6 = (a52) mapArr[i].get("ImageLength");
        a52 a52Var7 = (a52) mapArr[i].get("ImageWidth");
        if (a52Var6 == null || a52Var7 == null) {
            a52 a52Var8 = (a52) mapArr[i].get("JPEGInterchangeFormat");
            a52 a52Var9 = (a52) mapArr[i].get("JPEGInterchangeFormatLength");
            if (a52Var8 == null || a52Var9 == null) {
                return;
            }
            int iE5 = a52Var8.e(this.f);
            int iE6 = a52Var8.e(this.f);
            d52Var.d(iE5);
            byte[] bArr = new byte[iE6];
            d52Var.readFully(bArr);
            f(new z42(bArr), iE5, i);
        }
    }

    public final void y() throws Throwable {
        w(0, 5);
        w(0, 4);
        w(5, 4);
        HashMap[] mapArr = this.d;
        a52 a52Var = (a52) mapArr[1].get("PixelXDimension");
        a52 a52Var2 = (a52) mapArr[1].get("PixelYDimension");
        if (a52Var != null && a52Var2 != null) {
            mapArr[0].put("ImageWidth", a52Var);
            mapArr[0].put("ImageLength", a52Var2);
        }
        if (mapArr[4].isEmpty() && o(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        o(mapArr[4]);
        u(0, "ThumbnailOrientation", "Orientation");
        u(0, "ThumbnailImageLength", "ImageLength");
        u(0, "ThumbnailImageWidth", "ImageWidth");
        u(5, "ThumbnailOrientation", "Orientation");
        u(5, "ThumbnailImageLength", "ImageLength");
        u(5, "ThumbnailImageWidth", "ImageWidth");
        u(4, "Orientation", "ThumbnailOrientation");
        u(4, "ImageLength", "ThumbnailImageLength");
        u(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
