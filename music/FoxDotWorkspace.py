Clock.bpm=120

print(Player.get_attributes())
print(SynthDefs)


p1 >> space([0,-1.5,0,-1.5,0,-1.5,0,-1.5,0,1.5], dur=[1,1/4,1,1/4,1,1/4,1/2,1/2,1/2,4]).every(6, "alt", P[0,-1.5,0,-1.5,0,-1.5,0,-1.5,0,1.5,4])

p2 >> sawbass([0,-1.5,0,-1.5,0,-1.5,0,-1.5,0,1.5], dur=[1,1/4,1,1/4,1,1/4,1/2,1/2,1/2,4]).every(6, "alt", P[0,-1.5,0,-1.5,0,-1.5,0,-1.5,0,1.5,4])
p2.amp=0.25

p3 >> space([1,3], dur=[12,2], vib=4, vibdepth=.05)

p1.stop()

p2.stop()
p3.stop()

# Play only this player, muting others
p1.solo() # defaults to 1

# And turn the solo off
p1.solo(0)

# Stop (not just mute) the other players
p1.only()

# Use Ctrl+. to clear everything for the scheduling clock or run
Clock.clear()
