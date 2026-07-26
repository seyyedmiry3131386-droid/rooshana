package com.microsoft.clarity.models.ingest.analytics;

import com.microsoft.clarity.models.ingest.EventType;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import com.microsoft.clarity.q.c;
import defpackage.dw1;
import defpackage.js3;
import defpackage.m88;
import defpackage.wq2;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class ClickEvent extends AnalyticsEvent {
    private final float absX;
    private final float absY;
    private String nodeSelector;
    private boolean reaction;
    private int relativeX;
    private int relativeY;
    private final long rootViewUniqueDrawingId;
    private String text;
    private final EventType type;
    private int viewId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickEvent(long j, ScreenMetadata screenMetadata, float f, float f2, long j2) {
        super(j, screenMetadata);
        js3.p(screenMetadata, "screenMetadata");
        this.absX = f;
        this.absY = f2;
        this.rootViewUniqueDrawingId = j2;
        this.type = EventType.Click;
    }

    private final String getNodeHashSelector() {
        int i;
        String str = this.nodeSelector;
        if (str == null) {
            return null;
        }
        MessageDigest messageDigest = c.a;
        int i2 = 0;
        int iK = wq2.K(0, str.length() - 1, 2);
        int iCharAt = 5381;
        if (iK >= 0) {
            int iCharAt2 = 5381;
            while (true) {
                iCharAt = ((iCharAt << 5) + iCharAt) ^ str.charAt(i2);
                int i3 = i2 + 1;
                if (i3 < str.length()) {
                    iCharAt2 = ((iCharAt2 << 5) + iCharAt2) ^ str.charAt(i3);
                }
                if (i2 == iK) {
                    break;
                }
                i2 += 2;
            }
            i = iCharAt;
            iCharAt = iCharAt2;
        } else {
            i = 5381;
        }
        long jAbs = Math.abs((((long) iCharAt) * ((long) 11579)) + ((long) i));
        js3.q(36);
        String string = Long.toString(jAbs, 36);
        js3.o(string, "toString(this, checkRadix(radix))");
        return string;
    }

    public final float getAbsX() {
        return this.absX;
    }

    public final float getAbsY() {
        return this.absY;
    }

    public final String getNodeSelector() {
        return this.nodeSelector;
    }

    public final boolean getReaction() {
        return this.reaction;
    }

    public final int getRelativeX() {
        return this.relativeX;
    }

    public final int getRelativeY() {
        return this.relativeY;
    }

    public final long getRootViewUniqueDrawingId() {
        return this.rootViewUniqueDrawingId;
    }

    public final String getText() {
        return this.text;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public EventType getType() {
        return this.type;
    }

    public final int getViewId() {
        return this.viewId;
    }

    @Override // com.microsoft.clarity.models.ingest.SessionEvent
    public String serialize(long j) {
        int i = this.viewId;
        if (i == -1) {
            i = 0;
        }
        js3.q(36);
        String string = Integer.toString(i, 36);
        js3.o(string, "toString(this, checkRadix(radix))");
        StringBuilder sb = new StringBuilder("[");
        sb.append(relativeTimestamp(j));
        sb.append(',');
        sb.append(getType().getCustomOrdinal());
        sb.append(',');
        sb.append(i);
        sb.append(',');
        sb.append(StrictMath.round(this.absX));
        sb.append(',');
        sb.append(StrictMath.round(this.absY));
        sb.append(',');
        sb.append(this.relativeX);
        sb.append(',');
        sb.append(this.relativeY);
        sb.append(",0,");
        sb.append(this.reaction ? 1 : 0);
        sb.append(",0,\"");
        String str = this.text;
        if (str == null) {
            str = "";
        }
        sb.append(m88.X(m88.X(m88.X(m88.X(str, "\\", "\\\\"), "\"", "\\\""), "\r\n", " "), "\n", " "));
        sb.append("\",null,\"");
        sb.append(string);
        sb.append('.');
        return dw1.s(sb, getNodeHashSelector(), "\"]");
    }

    public final void setNodeSelector(String str) {
        this.nodeSelector = str;
    }

    public final void setReaction(boolean z) {
        this.reaction = z;
    }

    public final void setRelativeX(int i) {
        this.relativeX = i;
    }

    public final void setRelativeY(int i) {
        this.relativeY = i;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setViewId(int i) {
        this.viewId = i;
    }

    public String toString() {
        return serialize(0L);
    }
}
