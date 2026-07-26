package ir.mservices.market.app.detail.data;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class CategorySummaryDto implements Serializable {

    @vo7("backgroundColor")
    private final String backgroundColor;

    @vo7("foregroundColor")
    private final String foregroundColor;

    @vo7("iconUrl")
    private final String iconUrl;

    @vo7("id")
    private final String id;

    @vo7("layoutKey")
    private final String layoutKey;

    @vo7("title")
    private final String title;

    @vo7("type")
    private final String type;

    public CategorySummaryDto(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        js3.p(str, "foregroundColor");
        js3.p(str2, "backgroundColor");
        js3.p(str3, "id");
        this.foregroundColor = str;
        this.backgroundColor = str2;
        this.id = str3;
        this.layoutKey = str4;
        this.title = str5;
        this.iconUrl = str6;
        this.type = str7;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLayoutKey() {
        return this.layoutKey;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }
}
