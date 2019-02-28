# Live Code Stuff
FoxDot and Sonic Pi Info

#### SynthDefs

|        |              |              |               |               |               |               |             |             |             |
|---------------|--------------|--------------|---------------|---------------|---------------|---------------|-------------|-------------|-------------|
|    loop       |    noise     |    growl     |    rave       |    gong       |    scratch    |    creep      |    feel     |    pluck    |    pulse    |
|    gsynth     |    dab       |    bass      |    scatter    |    soprano    |    klank      |    orient     |    glass    |    spark    |    saw      |
|    play1      |    varsaw    |    dirt      |    charm      |    dub        |    blip       |    zap        |    soft     |    fuzz     |    snick    |
|    play2      |    lazer     |    crunch    |    bell       |    viola      |    ripple     |    marimba    |    quin     |    bug      |    twang    |
|    audioin    |              |              |               |               |               |               |             |             |             |

#### Player.get_attributes())

|              |               |              |                |                  |                 |              |               |                |               |
|--------------|---------------|--------------|----------------|------------------|-----------------|--------------|---------------|----------------|---------------|
|    degree    |    buf        |    sample    |    rate        |    sus           |    benddelay    |    rate      |    lpr        |    chop        |    cut        |
|    oct       |    blur       |    env       |    amp         |    slide         |    coarse       |    pshift    |    swell      |    tremolo     |    room       |
|    freq      |    amplify    |    sus       |    midinote    |    slidedelay    |    striate      |    hpf       |    bpf        |    beat_dur    |    mix        |
|    dur       |    scale      |    fmod      |    channel     |    slidefrom     |    buf          |    hpr       |    bpr        |    echo        |    formant    |
|    delay     |    bpm        |    pan       |    vib         |    bend          |                 |    lpf       |    bpnoise    |    echotime    |    shape      |

#### Samples

|           |                      |           |                             |           |                        |            |                          |           |                       |
|-----------|----------------------|-----------|-----------------------------|-----------|------------------------|------------|--------------------------|-----------|-----------------------|
|    '!'    |    Yeah!             |    '='    |    Hi hat open              |    'M'    |    Acoustic toms       |    '\\'    |    Lazer                 |    'm'    |    808 toms           |
|    '#'    |    Crash             |    '@'    |    Gameboy noise            |    'N'    |    Gameboy SFX         |    '^'     |    'Donk'                |    'n'    |    Noise              |
|    '$'    |    Beatbox           |    'A'    |    Gameboy kick drum        |    'O'    |    Heavy snare         |    'a'     |    Gameboy hihat         |    'o'    |    Snare drum         |
|    '%'    |    Noise bursts      |    'B'    |    Short saw                |    'P'    |    Tabla long          |    'b'     |    Noisy beep            |    'p'    |    Tabla              |
|    '&'    |    Chime             |    'C'    |    Choral                   |    'Q'    |    Electronic stabs    |    'c'     |    Voice/string          |    'q'    |    Ambient stabs      |
|    '*'    |    Clap              |    'D'    |    Dirty snare              |    'R'    |    Metallic            |    'd'     |    Woodblock             |    'r'    |    Metal              |
|    '+'    |    Clicks            |    'E'    |    Ringing percussion       |    'S'    |    Tamborine           |    'e'     |    Electronic Cowbell    |    's'    |    Shaker             |
|    '-'    |    Hi hat closed     |    'F'    |    Trumpet stabs            |    'T'    |    Cowbell             |    'f'     |    Pops                  |    't'    |    Rimshot            |
|    '/'    |    Reverse sounds    |    'G'    |    Ambient stabs            |    'U'    |    Misc. Fx            |    'g'     |    Ominous               |    'u'    |    Soft snare         |
|    '1'    |    Vocals (One)      |    'H'    |    Clap                     |    'V'    |    Hard kick           |    'h'     |    Finger snaps          |    'v'    |    Soft kick          |
|    '2'    |    Vocals (Two)      |    'I'    |    Rock snare               |    'W'    |    Distorted           |    'i'     |    Jungle snare          |    'w'    |    Dub hits           |
|    '3'    |    Vocals (Three)    |    'J'    |    Ambient stabs            |    'X'    |    Heavy kick          |    'j'     |    Whines                |    'x'    |    Bass drum          |
|    '4'    |    Vocals (Four)     |    'K'    |    Percussive hits          |    'Y'    |    High buzz           |    'k'     |    Wood shaker           |    'y'    |    Percussive hits    |
|    '-'    |    Hi-hats           |    'L'    |    Noisy percussive hits    |    'Z'    |    Loud stabs          |    'l'     |    Robot noise           |    'z'    |    Scratch            |
|           |                      |           |                             |           |                        |            |                          |    | Hangdrum           |
|           |                      |           |                             |           |                        |            |                          |    '~'    |    Ride cymbal        |
|           |                      |           |                             |           |                        |            |                          |           |                       |


#### NOTES

```
Ab = 8
A = 9
As = 10
Bb = 10
B = 11
Cb = 11
C = 0
Cs = 1
Db = 1
D = 2
Ds = 3
Eb = 3
E = 4
Es = 5
F = 5
Fs = 6
Gb = 6
G = 7
Gs = 8
```

#### CHORDS
```
chC = (C,E,G)
chCs = (Cs,Es,Gs)
chCm = (C,Eb,G)
chD = (D,Fs,A)
chDm = (G,Bb,Eb,D)
chEb = (Eb,G,Bb)
chF = (F,A,C)
chFs = (Fs,As,Cs)
chE = (E,Gs,B)
chAb = (Ab,C,Eb)
chG = (G,B,D)
chA = (A,Cs,E)
chBb = (Bb,D,F)
chB = (B,Ds,Fs)

print(SynthDefs)
print(Buffers.Samples)
```

```
# Returns a random integer between start and stop. If start is a container-type it return a random item for that container.
# PRand(start, stop=None)
# PRand([0,1,2])
# PRand(1,10)
print(PRand(1,10)[:4])

# Returns random floating point values between 'lo' and 'hi'
# PWhite(lo=0, hi=1)
# PWhite(0,1)
print(PWhite(0,1)[:4])

# Returns a Pattern equivalent to ``Pattern(range(start, stop, step))
# PRange(start, stop=None, step=None)
print(PRange(0, 10, 1))

# Returns the Euclidean rhythm which spreads 'n' pulses over 'k' steps as evenly as possible.
# PEuclid(n, k)
print(PEuclid(3, 8))

# Returns the *actual* durations based on Euclidean rhythms (see PEuclid) where dur is the length of each step.
# PDur(n, k, start=0, dur=0.25)
print(PDur(3, 8))

# Returns a pattern of durations similar to how you might strum a guitar
# PStrum(n=4)
print(PStrum(8))

# Returns a PGroup of delay amounts that gradually decrease
# PQuicken(dur=1/2, stepsize=3, steps=6)
print(PQuicken(1/2, 3, 6))

# Returns values of one cycle of sine wave split into 'n' parts
# PSine(n=16):
print(PSine(16))
```

Alda, a music programming language for musicians. Windows | macOS | GNU/Linux FLOSS audio
https://github.com/alda-lang/alda

Gibber, creative coding for JavaScript. Google Chrome | Mozilla Firefox web JavaScript FLOSS audio visuals
https://gibber.cc/

FoxDot, Live Coding with Python and SuperCollider. Windows | macOS | GNU/Linux Python Supercollider FLOSS audio
http://foxdot.org/

Pure Data, an open source visual programming language that can be used to process and generate sound, video, 2D/3D graphics, and interface sensors, input devices, and MIDI. Windows | macOS | GNU/Linux graphical-language FLOSS audio visuals
https://puredata.info/

Sonic Pi, the Live Coding music synth for everyone. Windows | macOS | GNU/Linux Ruby Supercollider FLOSS audio
http://sonic-pi.net/

SuperCollider, a platform for audio synthesis and algorithmic composition, used by musicians, artists, and researchers working with sound. Windows | macOS | GNU/Linux FLOSS audio
http://supercollider.github.io/

TidalCycles, is a language for Live Coding pattern. Windows | macOS | GNU/Linxux Haskell Supercollider FLOSS audio
https://tidalcycles.org/
