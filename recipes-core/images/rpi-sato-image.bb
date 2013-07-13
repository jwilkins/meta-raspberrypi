DESCRIPTION = "A custom image based on core-image and x11/sato."

# don't include images based on core-image-minimal

IMAGE_FEATURES += "package-management ssh-server-dropbear splash \
    x11-sato x11-base hwcodecs"

# you can override the following three parameters in your local.conf
DEFAULT_TIMEZONE ?= "Universal"

# possible values are 1 (DVI only) or 2 (hdmi with audio)
DEFAULT_AUDIO_OUT ?= "2"

# possible values are internal or external
CUSTOM_FEED_CONFIG ?= "external"

IMAGE_INSTALL = "\
    ${CORE_IMAGE_BASE_INSTALL} \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    ${EXTRA_TIMEZONES} \
    ${XSERVER} \
    ${DESKTOP_APPS} \
    vc-graphics-hardfp \
    bcm2835-tests \
    bash \
    nano \
    zram \
    gkrellm \
    cpufrequtils \
    connman-tests \
    packagegroup-base-alsa \
    alsa-utils-speakertest \
    mpd \
    empcd \
    mc \
    vim \
    file \
    tzdata \
    ntp \
    ntpdate \
    ntp-utils \
    perl-module-socket \
    perl-module-getopt-std \
    usbutils \
    sysfsutils \
    bluez-hcidump \
    bluez4-agent \
"

# core-image bbclass provides core-boot and base packages
inherit core-image

XSERVER = " \
    packagegroup-core-x11 \
    packagegroup-core-x11-base \
    xkbcomp \
    xmodmap \
    xrdb \
    setxkbmap \
"    

DESKTOP_APPS = " \
    imagemagick \
    feh \
    mupdf \
    xchat \
    vala-terminal \
    leafpad \
    leafpad-stock-icons \
    midori \
    pcmanfm \
    xfmpc \
    gkrellm-client \
    gst-meta-video \
    gst-meta-audio \
"

WINDOW_MANAGER = " \
    gtk-theme-clearlooks \
    gtk-theme-crux \
    gtk-theme-mist \
    clearlooks-theme-enable \
    gnome-icon-theme \
    gnome-icon-theme-enable \
    hicolor-icon-theme \
"

EXTRA_TIMEZONES = " \
    tzdata-africa \
    tzdata-americas \
    tzdata-antarctica \
    tzdata-arctic \
    tzdata-asia \
    tzdata-atlantic \
    tzdata-australia \
    tzdata-europe \
    tzdata-misc \
    tzdata-pacific \
    tzdata-posix \
    tzdata-right \
"