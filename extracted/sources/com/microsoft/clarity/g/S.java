package com.microsoft.clarity.g;

import android.content.Context;
import com.microsoft.clarity.i.C0084f;
import com.microsoft.clarity.i.C0089k;
import com.microsoft.clarity.models.MaskingMode;
import com.microsoft.clarity.models.display.DisplayFrame;
import com.microsoft.clarity.models.display.commands.ClipRect;
import com.microsoft.clarity.models.display.commands.DisplayCommand;
import com.microsoft.clarity.models.display.commands.PaintableCommand;
import com.microsoft.clarity.models.display.paints.Paint;
import com.microsoft.clarity.models.observers.FramePicture;
import com.microsoft.clarity.models.viewhierarchy.WebViewData;
import defpackage.br9;
import defpackage.dp2;
import defpackage.js3;
import defpackage.u03;
import defpackage.wu0;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final class S {
    public final M a;
    public final com.microsoft.clarity.m.v b;
    public final LinkedBlockingQueue c;
    public String d;
    public final l0 e;

    public S(Context context, MaskingMode maskingMode, com.microsoft.clarity.m.s sVar, k0 k0Var, C0089k c0089k) {
        js3.p(context, "context");
        js3.p(maskingMode, "maskingMode");
        js3.p(sVar, "skiaParserFactory");
        js3.p(k0Var, "typefaceCollection");
        js3.p(c0089k, "errorCallback");
        this.a = new M(maskingMode, k0Var);
        this.b = new com.microsoft.clarity.m.v(sVar, new Q(c0089k));
        this.c = new LinkedBlockingQueue();
        a();
        this.e = new l0(context, maskingMode);
    }

    public static final void a(S s, DisplayFrame displayFrame) {
        s.getClass();
        List<DisplayCommand> commands = displayFrame.getCommands();
        ArrayList arrayList = new ArrayList();
        for (Object obj : commands) {
            if (obj instanceof ClipRect) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            ClipRect clipRect = (ClipRect) obj2;
            js3.p(clipRect, "clipRect");
            if (((int) clipRect.getRect().getRight()) == 999997 && ((int) clipRect.getRect().getBottom()) == 999997) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(wu0.V(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Long.valueOf((long) ((ClipRect) it.next()).getRect().getLeft()));
        }
        for (WebViewData webViewData : displayFrame.getViewHierarchy().getWebViewsData()) {
            if (arrayList3.contains(Long.valueOf(webViewData.getRenderNodeId()))) {
                webViewData.setFoundInDisplayList(true);
            }
        }
    }

    public static final void b(S s, DisplayFrame displayFrame) {
        s.getClass();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Paint paint : displayFrame.getPaints()) {
            int iHashCode = paint.hashCode();
            if (!linkedHashMap.containsKey(Integer.valueOf(iHashCode))) {
                arrayList.add(paint);
                linkedHashMap.put(Integer.valueOf(iHashCode), Integer.valueOf(br9.y(arrayList)));
            }
        }
        List<DisplayCommand> commands = displayFrame.getCommands();
        ArrayList<PaintableCommand> arrayList2 = new ArrayList();
        for (Object obj : commands) {
            if (obj instanceof PaintableCommand) {
                arrayList2.add(obj);
            }
        }
        for (PaintableCommand paintableCommand : arrayList2) {
            Integer paintIndex = paintableCommand.getPaintIndex();
            if (paintIndex != null) {
                Object obj2 = linkedHashMap.get(Integer.valueOf(displayFrame.getPaints().get(paintIndex.intValue()).hashCode()));
                js3.m(obj2);
                paintableCommand.setPaintIndex((Integer) obj2);
            }
        }
        displayFrame.setPaints(arrayList);
    }

    public final void a(FramePicture framePicture, C0084f c0084f) throws InterruptedException, IOException {
        js3.p(framePicture, "framePicture");
        js3.p(c0084f, "callback");
        framePicture.getPicture().endRecording();
        PipedInputStream pipedInputStream = new PipedInputStream(1048576);
        PipedOutputStream pipedOutputStream = new PipedOutputStream(pipedInputStream);
        N n = new N(framePicture, pipedInputStream, c0084f);
        this.c.add(n);
        try {
            HashMap map = com.microsoft.clarity.q.p.a;
            Method methodA = com.microsoft.clarity.q.o.a("android.graphics.Picture", "writeToStream", OutputStream.class);
            if (methodA != null) {
                methodA.invoke(framePicture.getPicture(), pipedOutputStream);
            }
            pipedOutputStream.flush();
            pipedOutputStream.close();
            n.d.await();
        } finally {
        }
    }

    public final void a() {
        new Thread(new u03(23, this)).start();
    }

    public static final void a(S s) {
        js3.p(s, "this$0");
        while (true) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            com.microsoft.clarity.q.g.a(new O(s, ref$ObjectRef), (dp2) null, new P(ref$ObjectRef), 6);
        }
    }
}
