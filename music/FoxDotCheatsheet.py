#CMajor = [C, D, E, F, G, A, B]
#CMajor = [0, 1, 2, 3, 4, 5, 6]

print(SynthDefs)
loop
gsynth
play1
play2
audioin
noise
dab
varsaw
lazer
growl
bass
dirt
crunch
rave
scatter
charm
bell
gong
soprano
dub
viola
scratch
klank
blip
ripple
creep
orient
zap
marimba
feel
glass
soft
quin
pluck
spark
fuzz
bug
pulse
saw
snick
twang

() Putting two or more characters in round brackets will alternate which sound to play on each loop through the sequence
[] Putting multiple characters in square brackets will play them successively in the space of one step.
{} Curly braces to pick a sound at random

d1 >> play("(x[--])xo{-[--][-x]}")

d1.stop()

print(Samples)
'!': Yeah!
'#': Crash
'$': Beatbox
'%': Noise bursts
'&': Chime
'*': Clap
'+': Clicks
'-': Hi hat closed
'/': Reverse sounds
'1': Vocals (One)
'2': Vocals (Two)
'3': Vocals (Three)
'4': Vocals (Four)
':': Hi-hats
'=': Hi hat open
'@': Gameboy noise
'A': Gameboy kick drum
'B': Short saw
'C': Choral
'D': Dirty snare
'E': Ringing percussion
'F': Trumpet stabs
'G': Ambient stabs
'H': Clap
'I': Rock snare
'J': Ambient stabs
'K': Percussive hits
'L': Noisy percussive hits
'M': Acoustic toms
'N': Gameboy SFX
'O': Heavy snare
'P': Tabla long
'Q': Electronic stabs
'R': Metallic
'S': Tamborine
'T': Cowbell
'U': Misc. Fx
'V': Hard kick
'W': Distorted
'X': Heavy kick
'Y': High buzz
'Z': Loud stabs
'\\': Lazer
'^': 'Donk'
'a': Gameboy hihat
'b': Noisy beep
'c': Voice/string
'd': Woodblock
'e': Electronic Cowbell
'f': Pops
'g': Ominous
'h': Finger snaps
'i': Jungle snare
'j': Whines
'k': Wood shaker
'l': Robot noise
'm': 808 toms
'n': Noise
'o': Snare drum
'p': Tabla
'q': Ambient stabs
'r': Metal
's': Shaker
't': Rimshot
'u': Soft snare
'v': Soft kick
'w': Dub hits
'x': Bass drum
'y': Percussive hits
'z': Scratch
'|': Hangdrum
'~': Ride cymbal

#############
print(Player.get_attributes())
degree'
oct'
freq'
dur'
delay
buf
blur
amplify
scale
bpm
sample
env
sus
fmod
pan
rate
amp
midinote
channel
vib
vibdepth
slide
sus
slidedelay
slidefrom
bend
benddelay
coarse
striate
buf
rate
pshift
hpf
hpr
lpf
lpr
swell
bpf
bpr
bpnoise
chop
tremolo
beat_dur
echo
echotime
spin
cut
room
mix
formant
shape



#############
p1 >> pluck([0, 2, 4], dur=[1, 1/2, 1/2], amp=0.75)

q1 >> pads([0, 1, 2, 3]).every(6, "alt", P[4, 5, 6, 7])

p1.stop()

q1 >> keys([1,2,3]).every(3, "reverse")
