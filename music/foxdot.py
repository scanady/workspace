## HELP
print(SynthDefs)
print(FxList)
print(Player.get_attributes())
Player.help()

## CLOCK
Clock.bpm=100

## NOTES
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

## CHORDS
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

## PLAYER CONTROL
p1.stop()
p1.solo() # defaults to 1 - 0 to stop
p1.only()
p2.stop()
d1.stop()
q1.stop()

## RANDOM UTILS
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
p1 >> jbass([-1,-2,0], dur=PStrum(8))

# Returns a PGroup of delay amounts that gradually decrease
# PQuicken(dur=1/2, stepsize=3, steps=6)
print(PQuicken(1/2, 3, 6))

# Returns values of one cycle of sine wave split into 'n' parts
# PSine(n=16):
print(PSine(16))

# PStutter(seq, n) -> Creates a pattern such that each item in the array is repeated n times (n can be a pattern)
# PStutter(x, n=2)
print(PStutter([5, 7],3))

## play a sample
p1 >> play("a")
p1.sample=5

p1 >> keys([0,-1.5,0,-1.5,0,-1.5,0,-1.5,0,1.5], dur=[1,1/4,1,1/4,1,1/4,1/2,1/2,1/2,4]).every(6, "alt", P[0,-1.5,0,-1.5,0,-1.5,0,-1.5,0,1.5,4])
q1 >> pads([0, 1, 2, 3]).every(6, "alt", P[4, 5, 6, 7])

p1 >> space(P[[0,1,2], -2, 3, (-4, -5)].shuffle(2), sus=p1.dur * 1.5, room=0.4, amp=sinvar([0.2,0.3],16))

p1.dur = 2

b1 >> sawbass(P[-4, -3, 0, 2], amp=linvar([.6, .5],PRand(2,4)))

d1 >> play("x--x--x--x", amp=linvar([1.2,.4], 12)).after(12, "stop")
d1 >> play("x--x--x--x", amp=1).every(4, "stutter")

b1.amp = linvar([1,0],48)

b1.slider()

b1.accompany(p1)

//stop the players
p1.amp=linvar([.5,0])

b1.stop()

# scratching effect
p1 >> loop("106Pad", P[:8]/2, dur=1/2, slide=PRand([0,-2,-1,-4]))
p1 >> space(P[[0,1,2], -2, 3, (-4, -5)], dur=4, slide=PRand([0,-1]))

# ALORITHMIC CONTROL
# Stop the player looping after 16 beats
p1 >> pads().after(16, "stop")

 # Call the shuffle method every 4 beats
p1.every(4, 'shuffle')
# Call the stutter method on the 5th beat of every 8 beat cycle
p1.every(5, 'stutter', 4, cycle=8)
# If the method is not valid but *is* a valid Pattern method, that is called and reverted
p1.every(4, 'palindrome')
