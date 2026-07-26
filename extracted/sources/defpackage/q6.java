package defpackage;

import android.graphics.Bitmap;
import ir.mservices.market.version2.ui.crop.b;

/* JADX INFO: loaded from: classes.dex */
public final class q6 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ q6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        Object obj;
        synchronized (((bb5) this.b).a) {
            obj = ((bb5) this.b).f;
            ((bb5) this.b).f = bb5.k;
        }
        ((bb5) this.b).h(obj);
    }

    /* JADX WARN: Failed to build post-dominance tree
    java.lang.ArrayIndexOutOfBoundsException: Index 227 out of bounds for length 227
    	at jadx.core.dex.visitors.blocks.DominatorTree.build(DominatorTree.java:68)
    	at jadx.core.dex.visitors.blocks.PostDominatorTree.compute(PostDominatorTree.java:32)
    	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:93)
    	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
     */
    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getId()" because "imPostDom" is null
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:186)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instruction units count: 1190
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q6.run():void");
    }

    public q6(b bVar, Bitmap bitmap) {
        this.a = 7;
        this.b = bVar;
    }
}
