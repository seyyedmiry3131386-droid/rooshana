package com.microsoft.clarity.models.ingest.analytics;

/* JADX INFO: loaded from: classes3.dex */
public enum Dimension {
    UserAgent(0),
    Url(1),
    Referrer(2),
    PageTitle(3),
    NetworkHosts(4),
    SchemaType(5),
    ProductBrand(6),
    ProductAvailability(7),
    AuthorName(8),
    Language(9),
    ProductName(10),
    ProductCategory(11),
    ProductSku(12),
    ProductCurrency(13),
    ProductCondition(14),
    TabId(15),
    PageLanguage(16),
    DocumentDirection(17),
    Headline(18),
    MetaType(19),
    MetaTitle(20),
    Generator(21),
    Platform(22),
    PlatformVersion(23),
    Brand(24),
    Model(25),
    DevicePixelRatio(26),
    ConnectionType(27),
    Dob(28),
    CookieVersion(29),
    DeviceFamily(30),
    InitialScrollTop(31),
    InitialScrollBottom(32),
    AncestorOrigins(33),
    TimeZone(34),
    TimeZoneOffset(35),
    Consent(36),
    InteractionNextPaint(37),
    CartProducts(1000),
    CartPrices(1001);

    private final int customOrdinal;

    Dimension(int i) {
        this.customOrdinal = i;
    }

    public final int getCustomOrdinal() {
        return this.customOrdinal;
    }
}
