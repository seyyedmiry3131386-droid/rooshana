package com.microsoft.clarity.models.viewhierarchy;

import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.o;
import com.microsoft.clarity.models.IProtoModel;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$ViewNodeDelta;
import com.microsoft.clarity.protomodels.mutationpayload.y1;
import defpackage.f88;
import defpackage.js3;
import defpackage.m88;
import defpackage.wu0;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewNode implements IProtoModel<MutationPayload$ViewNodeDelta> {
    private final Integer backgroundColor;
    private List<ViewNode> children;
    private final boolean clickable;
    private transient String contentDescription;
    private transient String fragmentName;
    private final int height;
    private final int id;
    private String idEntryName;
    private final boolean ignoreClicks;
    private boolean isMasked;
    private final boolean isWebView;
    private transient ViewNode previousFrameNode;
    private final long renderNodeId;
    private String text;
    private final String type;
    private final transient WeakReference<View> view;
    private final int viewHeight;
    private final int viewWidth;
    private final int viewX;
    private final int viewY;
    private final boolean visible;
    private final int width;
    private final int x;
    private final int y;

    public ViewNode(int i, String str, long j, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, boolean z2, boolean z3, boolean z4, Integer num, WeakReference<View> weakReference, String str2, String str3, boolean z5, String str4, ViewNode viewNode) {
        js3.p(str, "type");
        js3.p(str2, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(str3, "contentDescription");
        this.id = i;
        this.type = str;
        this.renderNodeId = j;
        this.x = i2;
        this.y = i3;
        this.width = i4;
        this.height = i5;
        this.viewX = i6;
        this.viewY = i7;
        this.viewWidth = i8;
        this.viewHeight = i9;
        this.visible = z;
        this.clickable = z2;
        this.ignoreClicks = z3;
        this.isWebView = z4;
        this.backgroundColor = num;
        this.view = weakReference;
        this.isMasked = z5;
        this.fragmentName = str4;
        this.previousFrameNode = viewNode;
        this.children = new ArrayList();
        this.idEntryName = "";
        this.text = "";
        this.contentDescription = "";
        setText(str2);
        setContentDescription(str3);
    }

    private final <T> T getNewValueIfDifferentOrNull(ViewNode viewNode, T t, T t2) {
        if (viewNode == null || !js3.i(t, t2)) {
            return t2;
        }
        return null;
    }

    public final void addChildView(ViewNode viewNode) {
        js3.p(viewNode, "view");
        this.children.add(viewNode);
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<ViewNode> getChildren() {
        return this.children;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final String getFragmentName() {
        return this.fragmentName;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getId() {
        return this.id;
    }

    public final String getIdEntryName() {
        return this.idEntryName;
    }

    public final boolean getIgnoreClicks() {
        return this.ignoreClicks;
    }

    public final ViewNode getPreviousFrameNode() {
        return this.previousFrameNode;
    }

    public final long getRenderNodeId() {
        return this.renderNodeId;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public final WeakReference<View> getView() {
        return this.view;
    }

    public final int getViewHeight() {
        return this.viewHeight;
    }

    public final int getViewWidth() {
        return this.viewWidth;
    }

    public final int getViewX() {
        return this.viewX;
    }

    public final int getViewY() {
        return this.viewY;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public final boolean isMasked() {
        return this.isMasked;
    }

    public final boolean isRoot() {
        return this.id == 0;
    }

    public final boolean isWebView() {
        return this.isWebView;
    }

    public final void setChildren(List<ViewNode> list) {
        js3.p(list, "<set-?>");
        this.children = list;
    }

    public final void setContentDescription(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.contentDescription = f88.I0(128, str);
    }

    public final void setFragmentName(String str) {
        this.fragmentName = str;
    }

    public final void setIdEntryName(String str) {
        js3.p(str, "<set-?>");
        this.idEntryName = str;
    }

    public final void setMasked(boolean z) {
        this.isMasked = z;
    }

    public final void setPreviousFrameNode(ViewNode viewNode) {
        this.previousFrameNode = viewNode;
    }

    public final void setText(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.text = f88.I0(128, str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.microsoft.clarity.models.IProtoModel
    public MutationPayload$ViewNodeDelta toProtobufInstance() {
        y1 y1VarNewBuilder = MutationPayload$ViewNodeDelta.newBuilder();
        y1VarNewBuilder.a(this.renderNodeId);
        ViewNode viewNode = this.previousFrameNode;
        Integer num = (Integer) getNewValueIfDifferentOrNull(viewNode, viewNode != null ? Integer.valueOf(viewNode.id) : null, Integer.valueOf(this.id));
        if (num != null) {
            y1VarNewBuilder.c(num.intValue());
        }
        ViewNode viewNode2 = this.previousFrameNode;
        String str = (String) getNewValueIfDifferentOrNull(viewNode2, viewNode2 != null ? viewNode2.type : null, this.type);
        if (str != null) {
            y1VarNewBuilder.c(str);
        }
        ViewNode viewNode3 = this.previousFrameNode;
        Integer num2 = (Integer) getNewValueIfDifferentOrNull(viewNode3, viewNode3 != null ? Integer.valueOf(viewNode3.x) : null, Integer.valueOf(this.x));
        if (num2 != null) {
            y1VarNewBuilder.i(num2.intValue());
        }
        ViewNode viewNode4 = this.previousFrameNode;
        Integer num3 = (Integer) getNewValueIfDifferentOrNull(viewNode4, viewNode4 != null ? Integer.valueOf(viewNode4.y) : null, Integer.valueOf(this.y));
        if (num3 != null) {
            y1VarNewBuilder.j(num3.intValue());
        }
        ViewNode viewNode5 = this.previousFrameNode;
        Integer num4 = (Integer) getNewValueIfDifferentOrNull(viewNode5, viewNode5 != null ? Integer.valueOf(viewNode5.width) : null, Integer.valueOf(this.width));
        if (num4 != null) {
            y1VarNewBuilder.h(num4.intValue());
        }
        ViewNode viewNode6 = this.previousFrameNode;
        Integer num5 = (Integer) getNewValueIfDifferentOrNull(viewNode6, viewNode6 != null ? Integer.valueOf(viewNode6.height) : null, Integer.valueOf(this.height));
        if (num5 != null) {
            y1VarNewBuilder.b(num5.intValue());
        }
        ViewNode viewNode7 = this.previousFrameNode;
        Integer num6 = (Integer) getNewValueIfDifferentOrNull(viewNode7, viewNode7 != null ? Integer.valueOf(viewNode7.viewX) : null, Integer.valueOf(this.viewX));
        if (num6 != null) {
            y1VarNewBuilder.f(num6.intValue());
        }
        ViewNode viewNode8 = this.previousFrameNode;
        Integer num7 = (Integer) getNewValueIfDifferentOrNull(viewNode8, viewNode8 != null ? Integer.valueOf(viewNode8.viewY) : null, Integer.valueOf(this.viewY));
        if (num7 != null) {
            y1VarNewBuilder.g(num7.intValue());
        }
        ViewNode viewNode9 = this.previousFrameNode;
        Integer num8 = (Integer) getNewValueIfDifferentOrNull(viewNode9, viewNode9 != null ? Integer.valueOf(viewNode9.viewWidth) : null, Integer.valueOf(this.viewWidth));
        if (num8 != null) {
            y1VarNewBuilder.e(num8.intValue());
        }
        ViewNode viewNode10 = this.previousFrameNode;
        Integer num9 = (Integer) getNewValueIfDifferentOrNull(viewNode10, viewNode10 != null ? Integer.valueOf(viewNode10.viewHeight) : null, Integer.valueOf(this.viewHeight));
        if (num9 != null) {
            y1VarNewBuilder.d(num9.intValue());
        }
        ViewNode viewNode11 = this.previousFrameNode;
        Boolean bool = (Boolean) getNewValueIfDifferentOrNull(viewNode11, viewNode11 != null ? Boolean.valueOf(viewNode11.visible) : null, Boolean.valueOf(this.visible));
        if (bool != null) {
            y1VarNewBuilder.e(bool.booleanValue());
        }
        ViewNode viewNode12 = this.previousFrameNode;
        Boolean bool2 = (Boolean) getNewValueIfDifferentOrNull(viewNode12, viewNode12 != null ? Boolean.valueOf(viewNode12.clickable) : null, Boolean.valueOf(this.clickable));
        if (bool2 != null) {
            y1VarNewBuilder.a(bool2.booleanValue());
        }
        ViewNode viewNode13 = this.previousFrameNode;
        Boolean bool3 = (Boolean) getNewValueIfDifferentOrNull(viewNode13, viewNode13 != null ? Boolean.valueOf(viewNode13.ignoreClicks) : null, Boolean.valueOf(this.ignoreClicks));
        if (bool3 != null) {
            y1VarNewBuilder.b(bool3.booleanValue());
        }
        ViewNode viewNode14 = this.previousFrameNode;
        Boolean bool4 = (Boolean) getNewValueIfDifferentOrNull(viewNode14, viewNode14 != null ? Boolean.valueOf(viewNode14.isWebView) : null, Boolean.valueOf(this.isWebView));
        if (bool4 != null) {
            y1VarNewBuilder.d(bool4.booleanValue());
        }
        ViewNode viewNode15 = this.previousFrameNode;
        Boolean bool5 = (Boolean) getNewValueIfDifferentOrNull(viewNode15, viewNode15 != null ? Boolean.valueOf(viewNode15.isMasked) : null, Boolean.valueOf(this.isMasked));
        if (bool5 != null) {
            y1VarNewBuilder.c(bool5.booleanValue());
        }
        ViewNode viewNode16 = this.previousFrameNode;
        if (((Integer) getNewValueIfDifferentOrNull(viewNode16, viewNode16 != null ? viewNode16.backgroundColor : null, this.backgroundColor)) != null) {
            y1VarNewBuilder.a();
            Integer num10 = this.backgroundColor;
            if (num10 != null) {
                y1VarNewBuilder.a(num10.intValue());
            }
        }
        ViewNode viewNode17 = this.previousFrameNode;
        String str2 = (String) getNewValueIfDifferentOrNull(viewNode17, viewNode17 != null ? viewNode17.idEntryName : null, this.idEntryName);
        if (str2 != null) {
            y1VarNewBuilder.a(str2);
        }
        ViewNode viewNode18 = this.previousFrameNode;
        String str3 = (String) getNewValueIfDifferentOrNull(viewNode18, viewNode18 != null ? viewNode18.text : null, this.text);
        if (str3 != null) {
            y1VarNewBuilder.b(m88.X(m88.X(m88.X(m88.X(str3, "\\", "\\\\"), "\"", "\\\""), "\r\n", " "), "\n", " "));
        }
        List<ViewNode> list = this.children;
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ViewNode) it.next()).toProtobufInstance());
        }
        y1VarNewBuilder.a(arrayList);
        this.previousFrameNode = null;
        o oVarBuild = y1VarNewBuilder.build();
        js3.o(oVarBuild, "builder.build()");
        return (MutationPayload$ViewNodeDelta) oVarBuild;
    }

    public /* synthetic */ ViewNode(int i, String str, long j, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, boolean z2, boolean z3, boolean z4, Integer num, WeakReference weakReference, String str2, String str3, boolean z5, String str4, ViewNode viewNode, int i10, yd1 yd1Var) {
        this(i, str, j, i2, i3, i4, i5, i6, i7, i8, i9, z, z2, z3, z4, (i10 & 32768) != 0 ? null : num, (i10 & 65536) != 0 ? null : weakReference, (i10 & 131072) != 0 ? "" : str2, (i10 & 262144) != 0 ? "" : str3, (i10 & 524288) != 0 ? false : z5, (i10 & 1048576) != 0 ? null : str4, (i10 & 2097152) != 0 ? null : viewNode);
    }
}
