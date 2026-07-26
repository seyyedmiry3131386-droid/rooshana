package nene.downloadmanager.exceptions.downloadfail;

import defpackage.eh5;

/* JADX INFO: loaded from: classes3.dex */
public class NeneDownloadFailException extends Exception {
    public static final int[] a;

    static {
        eh5.a("NeneDownloadFailException");
        a = new int[]{131, 1333, 1311, 1335, 1334, 1332, 132, 1331, 133};
    }

    public NeneDownloadFailException(String str) {
        super(str);
        b();
    }

    public int a() {
        return 131;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0017. Please report as an issue. */
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void b() {
        /*
            r2 = this;
            int r0 = r2.a()
            r1 = 1311(0x51f, float:1.837E-42)
            if (r0 == r1) goto L1a
            r1 = 1351(0x547, float:1.893E-42)
            if (r0 == r1) goto L1a
            r1 = 1341(0x53d, float:1.879E-42)
            if (r0 == r1) goto L1a
            r1 = 1342(0x53e, float:1.88E-42)
            if (r0 == r1) goto L1a
            switch(r0) {
                case 131: goto L1a;
                case 132: goto L1a;
                case 133: goto L1a;
                case 134: goto L1a;
                case 135: goto L1a;
                case 136: goto L1a;
                case 137: goto L1a;
                default: goto L17;
            }
        L17:
            switch(r0) {
                case 1331: goto L1a;
                case 1332: goto L1a;
                case 1333: goto L1a;
                case 1334: goto L1a;
                case 1335: goto L1a;
                default: goto L1a;
            }
        L1a:
            int r0 = r2.a()
            defpackage.dh5.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nene.downloadmanager.exceptions.downloadfail.NeneDownloadFailException.b():void");
    }

    public NeneDownloadFailException(Exception exc, String str) {
        super(str, exc);
        b();
    }
}
