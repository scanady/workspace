Clock.bpm = 100

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


p2 >> lazer(dur=.5, sus=2).follow(p1)

d1 >> play("x--x-oo", dur=.25)

print(SynthDefs)

p1 >> pluck((1,3,5,8,[1,2]), dur=1)

var.chords = var([0,4,5,4,2,1],4)

b1 >> bass(P[0,4,5,4,2,1].stutter(8), dur=0.5)

p1 >> pads(var.chords + (0,2), dur=PDur(7,14), amp=0.7)

p2 >> nylon(var.chords + (0,2), dur=PDur(6,13), amp=0.3)

p3 >> keys(var.chords + (0,2), dur=PDur(9,26))

p4 >> lazer([0,4,5,4,2,1], dur=4, amp=4, tremolo=0.2, chop=0.5, dist=0.1)

p5 >> soprano(dur=0.5).follow(b1)

p4.stop()

p1 >> piano([chG,chB,chC,chCm], dur=[1,rest(1)])

p1 >> bass(dist=linvar(.2,.1), room=0.2, mix=0.4, echo=0.25, amp=.4).follow(p2)

p2 >> piano([C,F,G,D,F], dur=[1,0.5,0.5,0.5,0.5], lpf=0, sus=2, pshift=0, shape=0.2, tremolo=2)

p1 >> pads([0,[4,6,7]], dur=PDur(3,8), chop=linvar(3,4), sus=1.5, fmod=(0.2,0.5), shape=0.3)

print(SynthDefs)

print(PDur(9,16))

print(FxList)

